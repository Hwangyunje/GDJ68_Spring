package com.is.main.Board.qna;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.is.main.Board.BoardDTO;
import com.is.main.Board.BoardService;
import com.is.main.Board.notice.NoticeDTO;
import com.is.main.util.FileManager;
import com.is.main.util.Pager;
@Service
public class QnaService implements BoardService {
	@Autowired
	private QnaDAO qnaDAO;
	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		pager.makeRowNum();
		pager.makePageNum(qnaDAO.getTotal(pager));
		return qnaDAO.getList(pager);
	}

	@Override
	public int setAdd(BoardDTO boardDTO, MultipartFile multipartFile, HttpSession sesstion) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Autowired
	private QnaBoardDAO qnaBoardDAO;
	@Autowired
	private FileManager fileMnager;

	public List<BoardDTO> getList(Pager pager)throws Exception{
		
		pager.makeRowNum();
		pager.makePageNum(qnaDAO.getTotal(pager));
		
		return qnaDAO.gerList(pager);
	}
	public NoticeDTO getDetail(QnaDTO qnaDTO)throws Exception{
		return qnaDAO.getDetail(qnaDTO);
	}
}
