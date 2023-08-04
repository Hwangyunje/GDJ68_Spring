package com.is.main.BookAccount;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.is.main.bankBook.BankBookDTO;
import com.is.main.util.Pager;

public class BookAccountDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE="com.is.main.BookAccount.BookAccountDAO.";
	
	//List
		public List<BookAccountDTO> getList(Pager pager)throws Exception{
			return sqlSession.selectList(NAMESPACE+"getList",pager);
		}
		
		//detail
		public BookAccountDTO getDetail(BookAccountDTO bookAccountDTO)throws Exception{
					
			return sqlSession.selectOne(NAMESPACE+"getDetail", bookAccountDTO);
		}
		//add
		public int setAdd(BookAccountDTO bookAccountDTO)throws Exception{
			return sqlSession.insert(NAMESPACE+"setAdd", bookAccountDTO);
		}
		//update
		public int setUpdate(BookAccountDTO bookAccountDTO)throws Exception{
			return sqlSession.update(NAMESPACE+"setUpdate", bookAccountDTO);
		}
		
		//delete
		public int setDelete(Long num)throws Exception{
			return sqlSession.delete(NAMESPACE+"setDelete", num);
		}

}
