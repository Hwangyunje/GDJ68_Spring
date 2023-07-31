package com.is.main.qnaBoard;

import java.util.Date;

public class QnaBoardDTO {

	private Long QnaNum;
	private String QnaName;
	private String QnaSubject;
	private String QnaContents;
	private Date QnaDate;
	private Long QnaHit;
	private Long REF;
	private Long STEP;
	private Long DEPTH;
	
	
	public Long getQnaNum() {
		return QnaNum;
	}
	public void setQnaNum(Long qnaNum) {
		QnaNum = qnaNum;
	}
	public String getQnaName() {
		return QnaName;
	}
	public void setQnaName(String qnaName) {
		QnaName = qnaName;
	}
	public String getQnaSubject() {
		return QnaSubject;
	}
	public void setQnaSubject(String qnaSubject) {
		QnaSubject = qnaSubject;
	}
	public String getQnaContent() {
		return QnaContents;
	}
	public void setQnaContent(String qnaContent) {
		QnaContents = qnaContent;
	}
	public Date getQnaDate() {
		return QnaDate;
	}
	public void setQnaDate(Date qnaDate) {
		QnaDate = qnaDate;
	}
	public Long getQnaHit() {
		return QnaHit;
	}
	public void setQnaHit(Long qnaHit) {
		QnaHit = qnaHit;
	}
	public Long getREF() {
		return REF;
	}
	public void setREF(Long rEF) {
		REF = rEF;
	}
	public Long getSTEP() {
		return STEP;
	}
	public void setSTEP(Long sTEP) {
		STEP = sTEP;
	}
	public Long getDEPTH() {
		return DEPTH;
	}
	public void setDEPTH(Long dEPTH) {
		DEPTH = dEPTH;
	}
}
