package com.is.main.util;


public class Pager {
	private Long startRow;
	private Long lastRow;
	
	//총 페이지의 갯수
	private Long totalPage;
	
	private Long page;
	
	private Long startNum;
	
	private Long lastNum;
	
	public Long getStartNum() {
		return startNum;
	}

	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}

	public Long getLastNum() {
		return lastNum;
	}

	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}



	//한페이지에 보여질 data(Row)의 갯수
	private Long perPage;
	
	public void makePageNum(Long total) {
		//130->13
		//131-139->14
		
		//1.전체갯수로 전체페이지수 구하기
		this.totalPage=total/ this.getPerPage();
		if(total%this.getPerPage() !=0) {
			this.totalPage++;
		}
		//2.전체페이지수로 전체block수구하기
		//한페이지에 출력할 번호의갯수
		long perBlock=5;
		
		long totalBlock =this.totalPage/perBlock;
		if(this.totalPage%perBlock !=0) {
			totalBlock++;
		}
		//3.현재 page번호로 block번호 구하기
		long curBlock=this.getPage()/perBlock;
		if(this.getPage()%perBlock !=0) {
			curBlock++;
		}
		//4.현재 블록번호의 시작번호와 끝번호 구하기
		//curBlock  	startNum	lastNum
		// 1			1			5
		//2				6			10
		//3				11			15
		
		
		this.startNum=(curBlock-1)*perBlock+1;
		this.lastNum=curBlock*perBlock;
		
		
	}
	
	public void makeRowNum() {
		this.startRow=(this.getPage()-1)*this.getPerPage()+1;
		this.lastRow=this.getPage()*this.getPerPage();
	}



	public Long getTotalpage() {
		return totalPage;
	}



	public void setTotalpage(Long totalpage) {
		this.totalPage = totalpage;
	}



	public Long getStartRow() {
		return startRow;
	}



	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}



	public Long getLastRow() {
		return lastRow;
	}



	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}



	public Long getPage() {
		if(this.page==null) {
			this.page=1L;
		}
		return page;
	}



	public void setPage(Long page) {
		this.page = page;
	}



	public Long getPerPage() {
		if(this.perPage==null) {
			this.perPage=10L;
		}
		return perPage;
	}



	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}
	
	
	
}
