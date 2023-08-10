package com.is.main.coment;

import java.sql.Date;

public class ComentDTO {

	private Long bookNum;
	private String id;
	private Long comentNum;
	private String comentName;
	private String comentContents;
	private Date comentDate;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getBookNum() {
		return bookNum;
	}
	public void setBookNum(Long bookNum) {
		this.bookNum = bookNum;
	}
	public Long getComentNum() {
		return comentNum;
	}
	public void setComentNum(Long comentNum) {
		this.comentNum = comentNum;
	}
	public String getComentName() {
		return comentName;
	}
	public void setComentName(String comentName) {
		this.comentName = comentName;
	}
	public String getComentContents() {
		return comentContents;
	}
	public void setComentContents(String comentContents) {
		this.comentContents = comentContents;
	}
	public Date getComentDate() {
		return comentDate;
	}
	public void setComentDate(Date comentDate) {
		this.comentDate = comentDate;
	}
	
	
}
