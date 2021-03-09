package com.casa.cloud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CasaApplication {
	
	public static ApplicationContext ap;
	
	static {
		ap = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Contexto cargado.");
	}
		

	public static void main(String[] args) {
		
		Casa c = ap.getBean("casa", Casa.class);
		System.out.println(c);
	
	}
	
}