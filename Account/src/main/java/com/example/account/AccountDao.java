package com.example.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class AccountDao {
	@Autowired
	AccountRepository ar;
	
	public String post(@RequestBody List<Account> a)
	{
		ar.saveAll(a);
		
		return "successfully";
	}

	public Account getbyusername(String a) {
		// TODO Auto-generated method stub
		return ar.getbyusername(a);
	}

}
