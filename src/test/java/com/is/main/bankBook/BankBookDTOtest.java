package com.is.main.bankBook;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankBookDTOtest {

	private int bankBooknum;
	private String bankBookName;
	private String bankBookContents;
	private Double bankBookRate;
	private boolean bankBookSale;
	
	
	
	public String getBankBookContents() {
		return bankBookContents;
	}
	public void setBankBookContents(String bankBookContents) {
		this.bankBookContents = bankBookContents;
	}
	public int getBankBooknum() {
		return bankBooknum;
	}
	public void setBankBooknum(int bankBooknum) {
		this.bankBooknum = bankBooknum;
	}
	public String getBankBookName() {
		return bankBookName;
	}
	public void setBankBookName(String bankBookName) {
		this.bankBookName = bankBookName;
	}
	public Double getBankBookRate() {
		return bankBookRate;
	}
	public void setBankBookRate(Double bankBookRate) {
		this.bankBookRate = bankBookRate;
	}
	public boolean isBankBookSale() {
		return bankBookSale;
	}
	public void setBankBookSale(boolean bankBookSale) {
		this.bankBookSale = bankBookSale;
	}
	
	
}
