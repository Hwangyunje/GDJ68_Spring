package com.is.main.notice;

import java.util.Date;

public class NoticeDTO {
 
	
		private Long noticeNo ;
		private String noticeSubject ;
		private String noticeName ;
		private Date noticeDate ;
		private Long noticeHit ;
		private String noticeContent;
		
		public String getNoticeContents() {
			return noticeContent;
		}
		public void setNoticeContents(String noticeContents) {
			this.noticeContent = noticeContents;
		}
		public Long getNoticeNo() {
			return noticeNo;
		}
		public void setNoticeNo(Long noticeNo) {
			this.noticeNo = noticeNo;
		}
		public String getNoticeSubject() {
			return noticeSubject;
		}
		public void setNoticeSubject(String noticeSubject) {
			this.noticeSubject = noticeSubject;
		}
		public String getNoticeName() {
			return noticeName;
		}
		public void setNoticeName(String noticeName) {
			this.noticeName = noticeName;
		}
		public Date getNoticeDate() {
			return noticeDate;
		}
		public void setNoticeDate(Date noticeDate) {
			this.noticeDate = noticeDate;
		}
		public Long getNoticeHit() {
			return noticeHit;
		}
		public void setNoticeHit(Long noticeHit) {
			this.noticeHit = noticeHit;
		}
		
		
		
		
}
