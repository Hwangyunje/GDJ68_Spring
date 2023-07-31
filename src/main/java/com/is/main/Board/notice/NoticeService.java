package com.is.main.Board.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.is.main.bankBook.BankBookDTO;
import com.is.main.bankBook.BankBookFileDTO;
import com.is.main.Board.BoardDTO;
import com.is.main.Board.BoardService;
import com.is.main.Board.notice.NoticeDTO;
import com.is.main.util.Pager;

@Service
public class NoticeService implements BoardService{
	@Autowired
	private NoticeDAO noticeDAO;
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception{
		pager.makeRowNum();
		Long total = noticeDAO.getTotal(pager);
		pager.makePageNum(total);
		return noticeDAO.getList(pager);
	}
	@Override
	public int setAdd (BoardDTO boardDTO, MultipartFile [] files, HttpSession session) throws Exception{
String path="/resources/upload/notice/";
		
		//long num = bankBookDAO.getSequence();
		//bankBookDTO.setBookNum(num);

		int result =boardDAO.setAdd(boardDTO);
		
		for(MultipartFile multipartFile: files) {
			String fileName=fileManager.fileSave(path, session, multipartFile);
			NoticeFileDTO noticeFileDTO = new NoticeFileDTO();
			noticeFileDTO.setOriginalName(multipartFile.getOriginalFilename());
			noticeFileDTO.setFileName(fileName);
			noticeFileDTO.setNoticeNo(boardDTO.getNum());
			result = noticeDAO.setFileAdd(noticeFileDTO);
		}
		
		return result;
	}
	@Override
	public NoticeDTO getDetail(BoardDTO boardDTO)throws Exception{
		return noticeDAO.getDetail(boardDTO);
	}
	@Override
	public int setUpdate(BoardDTO boardDTO)throws Exception{
		return noticeDAO.setUpdate(boardDTO);
	}
	@Override
	public int setDelete(Long No) throws Exception{
		return noticeDAO.setDelete(No);
	}
	
}
