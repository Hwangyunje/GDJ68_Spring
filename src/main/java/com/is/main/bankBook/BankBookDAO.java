package com.is.main.bankBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.is.main.util.Pager;

@Repository //해당클래스의 객체를 생성
public class BankBookDAO {
	
	@Autowired
	private SqlSession sqlSession;
		
	private final String NAMESPACE="com.is.main.bankBook.BankBookDAO.";
	
	//total
	public Long getTotal(Pager pager) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getTotal",pager);
	}
	
	//List
		public List<BankBookDTO> getList(Pager pager) throws Exception {
			return sqlSession.selectList(NAMESPACE+"getList", pager);
		}
	//detail
	public BankBookDTO getDetail (BankBookDTO bankBookDTO) throws Exception{
		
		return sqlSession.selectOne(NAMESPACE+"getDetail",bankBookDTO);	
	}
	
	//add
	public int setAdd (BankBookDTO bankBookDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"setAdd", bankBookDTO);
	}
	
	//update
	public int setUpdate(BankBookDTO bankBookDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"setUpdate", bankBookDTO);
	}
	
	//delete
	public int setDelete (Long num) throws Exception{
		 return sqlSession.delete(NAMESPACE+"setDelete", num);
	}	
	
	
}
