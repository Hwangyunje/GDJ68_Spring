package com.is.main.Board.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.is.main.Board.BoardDAO;
import com.is.main.Board.BoardDTO;
import com.is.main.util.Pager;

public class QnaDAO implements BoardDAO {

	private SqlSession session;
	
	private final String NAMESPACE="com.is.main.Board.qna.QnaDAO";
	
	@Override
	public List<BoardDTO> gerList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(NAMESPACE+"getList",pager);
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setAdd(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return session.insert(NAMESPACE+"setAdd",boardDTO);
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

	@Override
	public Long getTotal(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setHitUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
