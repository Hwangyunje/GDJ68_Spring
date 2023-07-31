package com.is.main.board;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.is.main.Mytest;
import com.is.main.bankBook.BankBookDAO;

public class BoardDAOtest extends Mytest {
	@Autowired
	private BankBookDAO bankBookDAO;
//	
//	@Test
//	public void getNoListTest () throws Exception{
//		List<NoticeDTO>ar= noticeDAO.getList();
//		AssertNotEquals(0,ar.size());
//	}
//	
//	
}
