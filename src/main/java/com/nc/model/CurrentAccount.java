package com.nc.model;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class CurrentAccount implements Account{
	
	private Card card;
	
	public Card getCard() {
		return card;
	}
	
	public CurrentAccount(Card card ) {
		this.card = card;
	}
	
	@Override
	public String createAccount() {
		return "Current Account has been Created.........";
	}
}
