package com.is.main.member;

import javax.servlet.http.HttpSession;

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
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public void getLogin()throws Exception{
		
	}
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String getLogin(MemberDTO memberDTO, HttpSession session)throws Exception{
		memberDTO=memberService.getLogin(memberDTO);
		
		if(memberDTO !=null) {
			session.setAttribute("member", memberDTO);
		}
		
		return "redirect:/";
		
	}
	@RequestMapping(value="join", method=RequestMethod.GET)
	public String getJoin() throws Exception{
		System.out.println("join");
		memberService.service();
		return "member/join";
	}
	@RequestMapping(value="logout",method = RequestMethod.GET)
	public String getLogout(HttpSession session) throws Exception{
		session.invalidate();
		
		return "redirect:../";
	}
	
	@RequestMapping(value="mypage",method=RequestMethod.GET)
	public void getMypage()throws Exception{
		
	}	
}
