package com.is.main.coment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.is.main.bankBook.BankBookDAO;
import com.is.main.util.FileManager;
import com.is.main.util.Pager;

@Service
public class ComentService {
	@Autowired
	private ComentDAO comentDAO;
	@Autowired
	private FileManager filemanager;
	
	public List<ComentDTO> getComentList(Pager pager, ComentDTO comentDTO)throws Exception{
		Map<String, Object> map=new HashMap<String,Object>();
		pager.makeRowNum();
		pager.makePageNum(ComentDAO.getComentTotal(comentDTO));
		map.put("pager", pager);
		map.put("coment", comentDTO);
		
		return comentDAO.getComentList(map);
	}

	public int setComentAdd(ComentDTO comentDTO) throws Exception{
		return comentDAO.setComentAdd(comentDTO);
	}
}
