package com.revature;

//Assignment:
	// Come up with an example of inheritance and polymorphism
	// and how you might accomplish that
	// Have constructors
	// Have getters and setters
	// have different methods
	// Method overriding in the child class, and show inheritance

	// This is my superclass (parent class)
	// Everything will be inherited from here

public class Smartphone {
	
	//These are my variables
	public int releaseYear;
	public String brand1 = "Apple";
	public String brand2 = "Samsung";
	public String model1 = "11 Pro Max";
	public String model2 = "Note 20 Ultra";
	
	
	//This is my constructor
	//This is default and can be provided by compiler
	// Constructor is a special method used to initialize objects
	public Smartphone() {
		super();
	}
	
	//This is my method
	public void phoneSound() {
		System.out.println("The smartphone makes a sound.");

	}

}
