package com.is.main.bankBook;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.is.main.Mytest;

public class BankBookDAOtest extends Mytest {
	@Autowired
	private BankBookDAO bankBookDAO;
	
	
	@Test
	public void addTest() throws Exception {
		BankBookDTO bankBookDTO=new BankBookDTO();
		
		for(int i=0;i<30;i++) {
		
		bankBookDTO.setBookName("연금적금"+i);
		bankBookDTO.setBookContents("연금적금 내용"+i);
		bankBookDTO.setBookRate(2.3);
		bankBookDTO.setBookSale(1);
		bankBookDAO.setAdd(bankBookDTO);
		}
		System.out.println("Finish");
	}

}
