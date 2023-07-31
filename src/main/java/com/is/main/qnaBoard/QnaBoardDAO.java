package com.is.main.qnaBoard;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.is.main.util.Pager;
@Repository
public class QnaBoardDAO {
	@Autowired
	private SqlSession sqlsession;
	
	private final String NAMESPACE="com.is.main.qnaBoard.QnaBoardDAO.";

	public Long getTotal(Pager pager)throws Exception{
		return sqlsession.selectOne(NAMESPACE+"getTotal",pager);
	}
	public List<QnaBoardDTO> getList(Pager pager)throws Exception{
		return sqlsession.selectList(NAMESPACE+"getList",pager);
	}
	
}
