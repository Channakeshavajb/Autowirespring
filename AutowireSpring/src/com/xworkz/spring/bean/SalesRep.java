package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class SalesRep {
	
	@Value("English")
	private String language;
	
	/*
	public SalesRep(@Value("English") String language) {
		this.language=language;
	}
	*/
	public SalesRep() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	
	public boolean sell(String product) {
		
		System.out.println("Rep knows language :\t"+this.language);
		System.out.println("Rep sold :\t"+product);
		
		return true;
		
		
		
	}
}
