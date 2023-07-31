package com.is.main.Board;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;

import com.is.main.util.Pager;

public interface BoardService {

	//list
	public List<BoardDTO> getList(Pager pager)throws Exception;
	//detail
	public BoardDTO getDetail(BoardDTO boardDTO)throws Exception;
	//add
	public int setAdd(BoardDTO boardDTO,MultipartFile multipartFile,HttpSession sesstion)throws Exception;
	//update
	public int setUpdate (BoardDTO boardDTO)throws Exception;
	//delete
	public int setDelete(BoardDTO boardDTO)throws Exception;
}
