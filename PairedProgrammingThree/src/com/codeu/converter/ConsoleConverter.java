package com.codeu.converter;

import java.util.Scanner;

public class ConsoleConverter{

	public static void main(String args[]){
		//print three lines with one string and system.out.println statement
		System.out.println("First\nSecond\nThird");

		
		
		//Instantiate a scanner object
		Scanner sc = new Scanner(System.in);
		
		//Send a message requesting input to the console
		System.out.println("Enter the miles you would like to convert to kilometers: ");

		//Store the supplied value in a variable for processing
		double milesConvert = sc.nextDouble();

		//Create a ref to Converter class
		Converter convObj = new Converter();
		
		convObj.milesToKilometers(milesConvert);


		//Close the scanner object to save memory
		sc.close();

	}
}
