package com.is.main.bankBook.bookAccount;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.is.main.Mytest;
import com.is.main.BookAccount.BookAccountDAO;
import com.is.main.BookAccount.BookAccountDTO;
import com.is.main.member.MemberDTO;

public class BookAccountDAOTest extends Mytest {
	@Autowired
	private BookAccountDAO dao;
	
	public void setAddTest () throws Exception{
		BookAccountDTO dto = new BookAccountDTO();
		dto.setId("");
		dto.setBookNum(1L);
		dto.setAccount(123456L);
		dto.setAccountBalance(0L);
		dto.setAccountPassword("0000");
		
		int result=dao.setAdd(dto);
		
		assertEquals(1, result);
	}
	
	@Test
	public void getListTest() {
		
		MemberDTO memberDTO= new MemberDTO();
		memberDTO.setId("11111111");
		List<BookAccountDTO> ar=dao.getList(memberDTO);
		
		assertEquals(0, ar.size());
		
	}

}
