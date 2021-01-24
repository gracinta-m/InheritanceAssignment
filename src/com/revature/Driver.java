package com.revature;

//Import from smartphone
//in order to use methods and variables
import com.revature.Smartphone;

public class Driver {

	public static void main(String[] args) {
		
		// Constructor that initiates Android object
		Android android1 = new Android ("Note 20 Ultra");
		
		//releaseYear is defined in Smartphone
		//Android inherits from Smartphone
		android1.releaseYear = 2020;
		
		android1.phoneSound();
		
		// Constructor that initiates iOS object
		iOS ios1 = new iOS ("11 Pro Max");
		
		//releaseYear is defined in Smartphone
		//iOS inherits from Smartphone
		ios1.releaseYear = 2020;
		
		ios1.phoneSound();

	}

}
