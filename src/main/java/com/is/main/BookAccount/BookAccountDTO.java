package com.is.main.BookAccount;

import java.sql.Date;

public class BookAccountDTO {
	
	private Long AccountNum;
	private String Id;
	private Long BookNum;
	private Long Account;
	private Long AccountPassword;
	private Long AccountBalance;
	private Date AccountDate;
	
	
	public Date getAccountDate() {
		return AccountDate;
	}
	public void setAccountDate(Date accountDate) {
		AccountDate = accountDate;
	}
	public Long getAccountNum() {
		return AccountNum;
	}
	public void setAccountNum(Long accountNum) {
		AccountNum = accountNum;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public Long getBookNum() {
		return BookNum;
	}
	public void setBookNum(Long bookNum) {
		BookNum = bookNum;
	}
	public Long getAccount() {
		return Account;
	}
	public void setAccount(Long account) {
		Account = account;
	}
	public Long getAccountPassword() {
		return AccountPassword;
	}
	public void setAccountPassword(Long accountPassword) {
		AccountPassword = accountPassword;
	}
	public Long getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(Long accountBalance) {
		AccountBalance = accountBalance;
	}
	
	
}
