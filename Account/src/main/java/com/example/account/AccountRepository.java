package com.example.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepository extends JpaRepository<Account,Integer> {

	 @Query(value="select * from account where username = ?",nativeQuery = true)
	Account getbyusername(String a);

}
