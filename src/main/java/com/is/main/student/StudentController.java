package com.is.main.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.is.main.bankBook.BankBookDTO;

@Controller
@RequestMapping("/student/")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="list",method = RequestMethod.GET)
	public String getList(Model model) throws Exception{
		List<StudentDTO> ar=studentService.getList();
		model.addAttribute("list", ar);
		return "student/list";
	}
	@RequestMapping(value = "detail")
	public ModelAndView getDetail(StudentDTO studentDTO, ModelAndView mv)throws Exception{
		
		//bankBookDTO.setBookNum(Long.parseLong(requestMapping.getParameter("bookNum"));
		studentDTO = studentService.getDetail(studentDTO);
		System.out.println(studentDTO.getStudentName());
		mv.addObject("dto", studentDTO);
		mv.setViewName("student/detail");
		return mv;
	}
	
	//form
	@RequestMapping(value="add", method = RequestMethod.GET)
	public void setAdd()throws Exception{
		
	}
	
	//db insert
	@RequestMapping(value="add", method = RequestMethod.POST)
	public String setAdd(StudentDTO studentDTO)throws Exception{
		int result = studentService.setAdd(studentDTO);
		return "redirect:./list";
	}
	
	//수정form
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public ModelAndView setUpdate(StudentDTO studentDTO,Model model)throws Exception{

		ModelAndView mv = new ModelAndView();
		mv.setViewName("student/update");
		mv.addObject("dto", studentDTO);
		return mv;
	}
	
	//update
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String setUpdate(StudentDTO studentDTO)throws Exception{
		int result = studentService.setUpdate(studentDTO);
		//return "redirect:./list";
		return "redirect:./detail?bookNum="+studentDTO.getStudentNum();
	}
	
	
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String setDelete(@RequestParam(name = "studentNum") Long num)throws Exception{
		int result = studentService.setDelete(num);
		
		return "redirect:./list";
	}
	
	

}
