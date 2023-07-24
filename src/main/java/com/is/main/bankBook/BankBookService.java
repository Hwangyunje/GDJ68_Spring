package com.is.main.bankBook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {

	@Autowired
	private BankBookDAO bankBookDAO;
	
	public List<BankBookDTOtest> getList() throws Exception{
		return bankBookDAO.getList();
	}
	
	public BankBookDTOtest getDetail(BankBookDTOtest bankBookDTO)throws Exception{
		return bankBookDAO.getDetail(bankBookDTO);
	}

	public int setAdd (BankBookDTOtest bankBookDTO) throws Exception{
		return bankBookDAO.setAdd(bankBookDTO);
	}
	
	public int setUpdate(BankBookDTOtest bankBookDTO)throws Exception{
		return bankBookDAO.setUpdate(bankBookDTO);
	}
	
	public int setDelete(Long num) throws Exception{
		return bankBookDAO.setDelete(num);
	}
	
}

