package com.is.main.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.is.main.bankBook.BankBookDTO;
import com.is.main.bankBook.BankBookFileDTO;
import com.is.main.notice.NoticeDTO;
import com.is.main.util.Pager;
import com.is.main.notice.NoticeDTO;

@Service
public class NoticeService {
	@Autowired
	private NoticeDAO noticeDAO;
	
	public List<NoticeDTO> getList(Pager pager) throws Exception{
		pager.makeRowNum();
		Long total = noticeDAO.getTotal(pager);
		pager.makePageNum(total);
		return noticeDAO.getList(pager);
	}
	public int setAdd (NoticeDTO noticeDTO, MultipartFile [] files, HttpSession session) throws Exception{
String path="/resources/upload/notice/";
		
		//long num = bankBookDAO.getSequence();
		//bankBookDTO.setBookNum(num);

		int result =noticeDAO.setAdd(noticeDTO);
		
		for(MultipartFile multipartFile: files) {
			String fileName=fileManager.fileSave(path, session, multipartFile);
			NoticeFileDTO noticeFileDTO = new NoticeFileDTO();
			noticeFileDTO.setOriginalName(multipartFile.getOriginalFilename());
			noticeFileDTO.setFileName(fileName);
			noticeFileDTO.setNoticeNo(noticeDTO.getNoticeNo());
			result = noticeDAO.setFileAdd(noticeFileDTO);
		}
		
		return result;
	}
	public NoticeDTO getDetail(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.getDetail(noticeDTO);
	}
	public int setUpdate(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.setUpdate(noticeDTO);
	}
	public int setDelete(Long No) throws Exception{
		return noticeDAO.setDelete(No);
	}
	
}
