package com.is.main.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Service
public class MemberService {
	@Autowired
	private MemberDAO memberDAO;
	
	public void service() {
		System.out.println("service");
		memberDAO.dao();
	}
}
