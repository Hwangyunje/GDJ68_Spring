package com.is.main.qnaBoard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.is.main.notice.NoticeDTO;
import com.is.main.notice.NoticeService;
import com.is.main.util.Pager;
@Controller
@RequestMapping("/qnaBoard/*")
public class QnaBoardController {

	@Autowired
	private QnaBoardService qnaBoardService;
	
	@RequestMapping(value="list")
	public String getList(Pager pager, String kind, String search,Model model)throws Exception{
		List<QnaBoardDTO> ar = qnaBoardService.getList(pager);
		model.addAttribute("list", ar);
		model.addAttribute("pager",pager);
		return "qnaBoard/list";
	}
}
