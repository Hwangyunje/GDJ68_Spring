package com.is.main.student;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.is.main.bankBook.BankBookDTO;

@Repository
public class StudentDAO {
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE="com.is.main.student.studentDAO.";
	
	public List<StudentDTO> getList() throws Exception{
		return sqlSession.selectList(NAMESPACE+"getList");
	}
}
