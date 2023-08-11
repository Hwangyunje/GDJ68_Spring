package com.is.main.coment;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.is.main.bankBook.BankBookService;
import com.is.main.member.MemberDTO;
import com.is.main.util.Pager;

@Controller
@RequestMapping("/coment/*")
public class ComentController {
	@Autowired
	private ComentService comentService;
	@GetMapping("commentList")
	public void getCommentList(ComentDTO comentDTO, Pager pager, Model model)throws Exception{
		pager.setPerPage(2L);
		List<ComentDTO> ar = ComentService.getComentList(pager, comentDTO);
		model.addAttribute("commentList", ar);
	}
	@PostMapping("comentAdd")
	public String setComentAdd(ComentDTO comentDTO,HttpSession session,Model model) throws Exception{
		MemberDTO memberDTO =(MemberDTO)session.getAttribute("member");
		comentDTO.setId(memberDTO.getId());
		int result=comentService.setComentAdd(comentDTO);
		model.addAttribute("result",result);
		return "commons/ajaxResult";
	}
}
