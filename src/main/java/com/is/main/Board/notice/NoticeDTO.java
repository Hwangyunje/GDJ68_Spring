package com.is.main.Board.notice;

import java.util.List;

import com.is.main.Board.BoardDTO;

public class NoticeDTO extends BoardDTO{
	
	private List<NoticeFileDTO> dtos;

	public List<NoticeFileDTO> getDtos() {
		return dtos;
	}

	public void setDtos(List<NoticeFileDTO> dtos) {
		this.dtos = dtos;
	}
	
	
}