package com.codeu.converter;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionConverter{

	public static void main(String args[]){


		//Instantiate a scanner object
		Scanner sc = new Scanner(System.in);
		

	    // prompt the user to enter their name
	    String s = JOptionPane.showInputDialog( "Enter the miles to convert to kilometers?");

	    //declare a variable to hold the user input
	    double milesToConvert;
	    
	    //make sure the user entered a value. We'll do more error checking as we learn more.
	    if ((s != null) && (s.length() > 0)) {
	    	
	    	//Get the double value of the passed string
	    	milesToConvert = Double.parseDouble(s); 


			//Create a ref to Converter class
			Converter convObj = new Converter();
			
			//Call the conversion method
			convObj.milesToKilometers(milesToConvert);
	    
	    
	    } else{
	    	//if there was nothing provided. do nothing
	    	System.err.println("Please be sure to enter something!");
	    }
	    


		//Close the scanner object to save memory
		sc.close();

	}
}
