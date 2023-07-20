package com.is.main.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.is.main.bankBook.BankBookService;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="join", method=RequestMethod.GET)
	public String getJoin() throws Exception{
		System.out.println("join");
		memberService.service();
		return "member/join";
	}
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String getLogin()throws Exception{
		System.out.println("login");
		return "member/login";
	}	
	@RequestMapping(value="mypage",method=RequestMethod.GET)
	public String getMypage()throws Exception{
		System.out.println("mypage");
		return "member/mypage";
	}	
	
	
}
