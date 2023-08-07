package com.is.main.BookAccount;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.is.main.bankBook.BankBookDTO;
import com.is.main.member.MemberDTO;
import com.is.main.util.Pager;
@Repository
public class BookAccountDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE="com.is.main.BookAccount.BookAccountDAO.";
	
	public Long getTotal() throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getTotal");
	}
	
	//List
		public List<BookAccountDTO> getList(Map<String, Object> map)throws Exception{
			return sqlSession.selectList(NAMESPACE+"getList",map);
		}
		//add
		public int setAdd(BookAccountDTO bookAccountDTO)throws Exception{
			return sqlSession.insert(NAMESPACE+"setAdd", bookAccountDTO);
		}
		
		//detail
		public BookAccountDTO getDetail(BookAccountDTO bookAccountDTO)throws Exception{
					
			return sqlSession.selectOne(NAMESPACE+"getDetail", bookAccountDTO);
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
