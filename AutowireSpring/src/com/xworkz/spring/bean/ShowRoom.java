package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("HondaShowroom")
public class ShowRoom {

	@Value("${car.type}")
	private String type;
	@Autowired
	private SalesRep salesRep;
	@Autowired
	private Manager manager;
	
	


	@Autowired
	public ShowRoom(SalesRep salesRep) {
		this.salesRep=salesRep;
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public void selling(String carName, Double price) {
		System.out.println(manager.getNoOfBranchesManaged() + "\tManager branches");
		if (carName != null && price != null) {

			if (price > 100) {
				System.out.println("sold car:\t" + carName);
				salesRep.sell(carName);
				return;
			}
		}
		System.out.println("car is not sold");
	}

	public String getType() {
		return type;
	}
}
