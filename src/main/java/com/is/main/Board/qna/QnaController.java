package com.is.main.Board.qna;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.is.main.board.notice.NoticeDTO;
import com.is.main.board.notice.NoticeService;
import com.is.main.util.Pager;
@Controller
@RequestMapping("/qna/*")
public class QnaController {

	@Autowired
	private QnaService qnaService;
	
	@RequestMapping(value="list")
	public String getList(Pager pager, Model model)throws Exception{
		List<QnaDTO> ar = qnaService.getList(pager);
		model.addAttribute("list", ar);
		model.addAttribute("pager",pager);
		return "board/list";
	}
	@RequestMapping(value="add", method = RequestMethod.GET)
	public String setAdd() throws Exception{
		return "board/add";
	}

	@RequestMapping(value="add", method = RequestMethod.POST)
	public String setAdd(QnaDTO qnaDTO,MultipartFile[] photos,HttpSession session) throws Exception{
	int result=qnaService.setAdd(qnaDTO, photos, session);
		return "redirect:./list";
	}	
}
