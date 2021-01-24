package com.revature;

	// This is my subclass (child class)
	//iOS will inherit from Smartphone

public class iOS extends Smartphone {

	//This is my variable
	public String model;
	
	//This is my 1st constructor
	//Not optional since I have multiple constructors
	public iOS() {
		super();
	}
		
	//This is my 2nd constructor
	public iOS(String model) {
		this.model = model;
	}
		
	//This is my method
	public void phoneSound() {
		System.out.println("*ring ring*");

	}

}
