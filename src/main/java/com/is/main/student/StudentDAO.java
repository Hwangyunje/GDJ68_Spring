package com.is.main.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //해당 클래스의 객체 생성
public class StudentDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE="com.iu.main.bankBook.BankBookDAO.";
	
	//List
	public List<StudentDAO> getList()throws Exception{
		return sqlSession.selectList(NAMESPACE+"getList");
	}
	
	//detail
	public StudentDTO getDetail(StudentDTO studentDTO)throws Exception{
				
		return sqlSession.selectOne(NAMESPACE+"getDetail", studentDTO);
	}
	
	//add
	public int setAdd(StudentDTO studentDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setAdd", studentDTO);
	}
	
	//update
	public int setUpdate(StudentDTO studentDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"setUpdate", studentDTO);
	}
	
	//delete
	public int setDelete(Long num)throws Exception{
		return sqlSession.delete(NAMESPACE+"setDelete", num);
	}

}