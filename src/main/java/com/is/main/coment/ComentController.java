package com.is.main.coment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.is.main.bankBook.BankBookService;
import com.is.main.util.Pager;

@Controller
@RequestMapping("/coment/*")
public class ComentController {
	@Autowired
	private ComentService comentService;
	@GetMapping("comentList")
	public String getComentList(ComentDTO comentDTO,Pager pager,Model model)throws Exception{
		List<ComentDTO> ar=BankBookService.getComentList(pager);
		model.addAttribute("ComentList",ar);
	}
}
