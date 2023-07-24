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
	
	public MemberDTO getLogin (MemberDTO memberDTO) throws Exception{
		return memberDAO.getLogin(memberDTO);
	}

	public int setMemberUpdate(MemberDTO memberDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void service() {
		// TODO Auto-generated method stub
		
	}
	
}

