package com.is.main.Board.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.is.main.Board.BoardDTO;
import com.is.main.Board.notice.NoticeDTO;
import com.is.main.util.Pager;
@Repository
public class QnaBoardDAO {
	@Autowired
	private SqlSession sqlsession;
	
	private final String NAMESPACE="com.is.main.qnaBoard.QnaBoardDAO.";

	public Long getTotal(Pager pager)throws Exception{
		return sqlsession.selectOne(NAMESPACE+"getTotal",pager);
	}
	public List<QnaDTO> getList(Pager pager)throws Exception{
		return sqlsession.selectList(NAMESPACE+"getList",pager);
	}
	@RequestMapping(value="add", method = RequestMethod.GET)
	public String setAdd() throws Exception{
		return "board/add";
	}
	public NoticeDTO getDetail (QnaDTO qnaDTO) throws Exception{
		
		return sqlSession.selectOne(NAMESPACE+"getDetail",qnaDTO);	
	}
}
