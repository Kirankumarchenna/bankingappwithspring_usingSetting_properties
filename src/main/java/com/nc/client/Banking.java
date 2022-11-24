package com.nc.client;


import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nc.config.appConfig;
import com.nc.model.Account;

public class Banking {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
		
		Account account = (Account) context.getBean(sc.next()); 
		System.out.println(account.createAccount());
		System.out.println(account.getCard().getCardDetails());
	}
}
