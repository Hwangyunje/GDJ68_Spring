package com.is.main.qnaBoard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.is.main.util.FileManager;
import com.is.main.util.Pager;
@Service
public class QnaBoardService {
	@Autowired
	private QnaBoardDAO qnaBoardDAO;
	@Autowired
	private FileManager fileMnager;

	public List<QnaBoardDTO> getList(Pager pager)throws Exception{
		
		pager.makeRowNum();
		Long total = qnaBoardDAO.getTotal(pager);
		pager.makePageNum(total);
		
		return qnaBoardDAO.getList(pager);
	}
}
