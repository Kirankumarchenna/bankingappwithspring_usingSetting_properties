package com.nc.model;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class SavingsAccount implements Account {
	
	private Card card;
	
	public Card getCard() {
		return card;
	}
	
	public void setCard(Card card) {
		this.card = card;
	}
	
	@Override
	public String createAccount() {
		return "Savings Account has been created successfully........";
	}

}
