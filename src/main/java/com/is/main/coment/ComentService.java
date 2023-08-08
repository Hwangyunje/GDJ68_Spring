package com.is.main.coment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.is.main.util.FileManager;
import com.is.main.util.Pager;

@Service
public class ComentService {
	@Autowired
	private ComentDAO comentDAO;
	@Autowired
	private FileManager filemanager;
	
	public List<ComentDTO> getList(Pager pager)throws Exception{
		
		pager.makeRowNum();
		Long total = comentDAO.getTotal(pager);
		pager.makePageNum(total);
		
		return comentDAO.getList(pager);
	}
}
