package com.is.main.bankBook;


import com.is.main.file.FileDTO;

public class BankBookFileDTO extends FileDTO {

	private Long BookNum;

	public Long getBookNum() {
		return BookNum;
	}

	public void setBookNum(Long bookNum) {
		BookNum = bookNum;
	}
}
