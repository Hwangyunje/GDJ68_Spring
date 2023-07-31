package com.is.main.board.qna;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.is.main.Mytest;
import com.is.main.Board.BoardDTO;
import com.is.main.Board.qna.QnaDAO;
import com.is.main.Board.qna.QnaDTO;

public class QnaDAOTest extends Mytest {
	@Autowired
	private QnaDAO qnaDAO;
	
	@Test
	public void setAddTest() throws Exception {
		QnaDTO boardDTO= new QnaDTO();
		boardDTO.setName("idx123");
		boardDTO.setSubject("test");
		boardDTO.setContents("test contents2");
		
		int result=qnaDAO.setAdd(null);
		assertEquals(1, result);
	}

}
