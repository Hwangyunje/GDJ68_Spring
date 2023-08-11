package com.is.main.Board.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.is.main.Board.BoardDTO;
import com.is.main.Board.BoardService;
import com.is.main.file.FileDTO;
import com.is.main.util.FileManager;
import com.is.main.util.Pager;

@Service
public class NoticeService implements BoardService {
	@Autowired
	private NoticeDAO noticeDAO;
	@Autowired
	private FileManager fileManager;

	public boolean setContentsImgDelete(String path,HttpSession session) throws Exception{
		//path: /resources/upload/notice/파일명
		FileDTO fileDTO =new FileDTO();
//		path=path.substring(0, path.lastIndexOf("\\")+1);
		fileDTO.setFileName(path.substring(path.lastIndexOf("/")+1));
		path="/resources/upload/notice/";
		return fileManager.fileDelete(fileDTO, path, session);
	}
	
	public String setContentsImg(MultipartFile file,HttpSession session)throws Exception {
		String path="/resources/upload/motice/";
		String fileName=fileManager.fileSave(path, session, file);
		return path+fileName;
		
	}
	
	public int setFileDelete(NoticeFileDTO noticeFileDTO,HttpSession session) throws Exception{
		//폴더 파일 삭제
		noticeFileDTO=noticeDAO.getFIleDetail(noticeFileDTO);
		boolean flag=fileManager.fileDelete(noticeFileDTO, "/resources/upload/notice/", null);
		
		if(flag) {
			
		
		//db삭제
			return noticeDAO.setFileDelete(noticeFileDTO);
		}
		return 0;
		}
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		pager.makeRowNum();
		pager.makePageNum(noticeDAO.getTotal(pager));
		return noticeDAO.getList(pager);
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.getDetail(boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO, MultipartFile[] files, HttpSession session) throws Exception {
		String path="/resources/upload/notice/";
		
		int result = noticeDAO.setAdd(boardDTO);
		for(MultipartFile file:files) {
			if(!file.isEmpty()) {
				String fileName=fileManager.fileSave(path, session, file);
				NoticeFileDTO noticeFileDTO = new NoticeFileDTO();
				noticeFileDTO.setNoticeNo(boardDTO.getNum());
				noticeFileDTO.setFileName(fileName);
				noticeFileDTO.setOriginalName(file.getOriginalFilename());
				result=noticeDAO.setFileAdd(noticeFileDTO);
			}
		}
		
		
		return result;
	}

	@Override
	public int setUpdate(BoardDTO boardDTO, MultipartFile[] files, HttpSession session) throws Exception {
		int result= noticeDAO.setUpdate(boardDTO);
		for(MultipartFile file:files) {
			String path="/resources/upload/notice/";
			if(!file.isEmpty()) {
				String fileName=fileManager.fileSave(path, session, file);
				NoticeFileDTO noticeFileDTO = new NoticeFileDTO();
				noticeFileDTO.setNoticeNo(boardDTO.getNum());
				noticeFileDTO.setFileName(fileName);
				noticeFileDTO.setOriginalName(file.getOriginalFilename());
				result=noticeDAO.setFileAdd(noticeFileDTO);
			}
		}
	
		return result;
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setDelete(boardDTO);
	}
	
	

}