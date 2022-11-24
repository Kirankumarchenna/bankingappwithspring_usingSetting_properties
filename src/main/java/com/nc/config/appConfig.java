package com.nc.config;

import org.springframework.context.annotation.Bean;

import com.nc.model.Account;
import com.nc.model.CurrentAccount;
import com.nc.model.SavingsAccount;

public class appConfig {
	
	@Bean("saving")
	public Account getSavingsAccount() {
		return new SavingsAccount();
	}
	
	/*
	 * @Bean("current") public Account getCurrentAccount() { return new
	 * CurrentAccount(); }
	 */

}
