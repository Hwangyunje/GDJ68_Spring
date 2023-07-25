//package com.is.main.bankBook;
//
//import static org.junit.Assert.*;
//
//import java.util.List;
//
//import org.apache.ibatis.session.SqlSession;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.is.main.Mytest;
//
//public class BankBookDAOtest extends Mytest {
//
//
//@Repository //해당클래스의 객체를 생성
//public class BankBookDAO {
//	
//	@Autowired
//	private SqlSession sqlSession;
//		
//	private final String NAMESPACE="com.is.main.bankBook.BankBookDAO.";
//	
//	//List
//	@Test
//	public List<BankBookDTOtest> getList() throws Exception{
//		return sqlSession.selectList(NAMESPACE+"getList");
//	}
//	
//}
//}
