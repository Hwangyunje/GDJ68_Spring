package com.is.main.bankBook;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bankbook/*")
public class BankBookController {
	
	@Autowired
	private BankBookService bankBookService;
	
	@RequestMapping(value="list", method=RequestMethod.GET)
	public String getList() throws Exception{
		System.out.println("list");
		bankBookService.service();
		
		return "bankbook/list";
	}
	
	@RequestMapping(value="detail", method=RequestMethod.GET)
	public ModelAndView getDetail()throws Exception{
		System.out.println("detail");
		//Model(request와 비슷한 역할) + view(jsp의경로담당or redirect경로)
		ModelAndView mv =new ModelAndView();
		mv.addObject("num", 123);
		mv.setViewName("bankbook/detail");
		return mv;
		
	}
	@RequestMapping(value = "add",method= RequestMethod.GET)
	public ModelAndView setAdd(ModelAndView mv)throws Exception{
		int num=333;
		//return "bankbook/add";
		//view의 경로명이 없으면 URL주소가 경로명으로 대체 됨
		mv.addObject("num", num);
		mv.setViewName("bankbook/add");
		return mv;
	}
	
	@RequestMapping(value ="add",method = RequestMethod.POST)
	public String setAdd(Model model,BankBookDTO bankBookDTO) throws Exception{
		int num=111;
		System.out.println(bankBookDTO.getBookName());
		System.out.println(bankBookDTO.getBookRate());
		System.out.println(bankBookDTO.getBookSale());
		for(int i=0;i<bankBookDTO.getSports().length;i++) {
			System.out.println(bankBookDTO.getSports()[i]);
		}
		
		System.out.println("===============");
//		BankBookDTO bankBookDTO =new BankBookDTO();
//		System.out.println(bookName);
//		System.out.println(bookSale);
//		System.out.println(bookRate);
//		System.out.println("===========");
//		bankBookDTO.setBookName(request.getParameter("bookName"));
//		bankBookDTO.setBookSale(Integer.parseInt(request.getParameter("bookSale"));
//		System.out.println(request.getParameter("bookName"));
//		System.out.println(request.getParameter("bookSale"));
//		String [] sports=request.getParameterValues("sports");
//		for(int i=0;i<sports.length;i++) {
//			System.out.println(sports[i]);
//		}
		System.out.println("sports");
		model.addAttribute("num", num);
		return "redirect:./list";
	}
	
	
}
