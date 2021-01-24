package com.revature;

	//This is my subclass (child class)
	//Android will inherit from Smartphone
	
public class Android extends Smartphone {

	//This is my variable
	public String model;
	
	//This is my 1st constructor
	//Not optional since I have multiple constructors
	public Android() {
		super();
	}
	
	//This is my 2nd constructor
	public Android(String model) {
		this.model = model;
	}
	
	//This is my method
	public void phoneSound() {
		System.out.println("*wind chimes*");

	}

}
