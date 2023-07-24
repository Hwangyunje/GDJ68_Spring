package com.is.main;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FrontController {
	
	//home
	// /주소가왔을때 실행,index.jsp
	
	//MemberController, GET
	//주소 .do삭제
	// /member/login
	@RequestMapping("/")
	public String home() {
		
	return "index";
	
}
	}
