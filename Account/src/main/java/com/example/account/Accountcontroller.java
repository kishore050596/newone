package com.example.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Accountcontroller {
   
	
	@Autowired
	AccountDao ad;
	
	
	@PostMapping(value="/post")
	public String post(@RequestBody List<Account> a)
	{
		return ad.post(a);			
	}
	
	@GetMapping(value="/get/{a}")
	public Account getbyusername(@PathVariable String a)
	{
		return ad.getbyusername(a);
	}
}
