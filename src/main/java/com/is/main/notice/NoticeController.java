package com.is.main.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.is.main.notice.NoticeDTO;
import com.is.main.util.Pager;



@Controller
@RequestMapping("/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping(value="list")
	public String getNoList(Pager pager,Model model)throws Exception{
		List<NoticeDTO> ar = noticeService.getList(pager);
		model.addAttribute("list", ar);
		model.addAttribute("pager",pager);
		return "board/list";
	}
	
	//form
	@RequestMapping(value="add", method = RequestMethod.GET)
	public String setAdd() throws Exception{
		return "board/add";
	}
		
	//db insert
	@RequestMapping(value="add", method = RequestMethod.POST)
	public String setAdd(NoticeDTO noticeDTO) throws Exception{
		
		int result = noticeService.setAdd(noticeDTO);
		return "redirect:./list";
	}
	
	@RequestMapping(value="detail") 
	public ModelAndView getDetail(NoticeDTO noticeDTO, ModelAndView mv)throws Exception{
		noticeDTO=noticeService.getDetail(noticeDTO);
		mv.addObject("dto", noticeDTO); 
		mv.setViewName("board/detail");
		return mv;
	}
	//수정form
	@RequestMapping(value="update", method = RequestMethod.GET)
	public String setUpdate (NoticeDTO noticeDTO, Model model) throws Exception{
		noticeDTO = noticeService.getDetail(noticeDTO);
		model.addAttribute("dto", noticeDTO);
		return "board/update";
	}
	//update
	@RequestMapping(value="update",method = RequestMethod.POST)
	public String setUpdate(NoticeDTO noticeDTO) throws Exception{
		int result=noticeService.setUpdate(noticeDTO);
		//return "redirect:./list";
		return "redirect:./detail?noticeNo="+noticeDTO.getNoticeNo();	
	}
	@RequestMapping(value="delete",method = RequestMethod.GET)
	public String setDelete (Long No) throws Exception{
		int result=noticeService.setDelete(No);
		return "redirect:./list";
	}
		
}