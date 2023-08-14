package com.is.main.interceptors;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.is.main.Board.BoardDTO;
import com.is.main.member.MemberDTO;

public class OwnerInterceptor extends HandlerInterceptorAdapter {
	
	//게시판
	//수정시 로그인한 유저와 작성자가 일치
	
	
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
		String method=request.getMethod();
		if(method.equals("post")) {
			return;
		}
		
		MemberDTO memberDTO=(MemberDTO)request.getSession().getAttribute("mamber");
		
		Map<String, Object> map=modelAndView.getModel();
		BoardDTO boardDTO=(BoardDTO)map.get("dto");
		
		if(!memberDTO.getId().equals(boardDTO.getName())) {
			modelAndView.addObject("message","작성자만 가능");
			modelAndView.addObject("url","./list");
			modelAndView.setViewName("commons/result");
		}
		
		
		
	}
	
}
