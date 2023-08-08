package com.is.main.coment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.is.main.util.Pager;

@Controller
@RequestMapping("/coment/*")
public class ComentController {
	@Autowired
	private ComentService comentService;
	
	@RequestMapping(value="list",method =RequestMethod.GET)
	public String getList(Pager pager,Model model)throws Exception{
		List<ComentDTO> ar = comentService.getList(pager);
		model.addAttribute("list",ar);
		model.addAttribute("pager", pager);
		return "coment/list";
	}
}
