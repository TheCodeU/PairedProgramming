package com.codeu.converter;

public class Converter {
	
	 void  milesToKilometers(double miles){
		 
		 //Utilize the supplied parameter to convert miles to kilometers
			double kilometers = miles * 1.6;
			
			String milePlural = "mile";
			String kilometerPlural = "kilometer";
			
			//Is it one mile or more than one mile?
			if(miles != 1){
				milePlural  = milePlural + "s";
			}

			//Is it one kilometer or more than one kilometer(.625)?
			if(kilometers != 1){
				kilometerPlural  = kilometerPlural + "s";
			}

			

		 /*
			Lets format the values used for both of our doubles
			https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html*/
			
			System.out.printf("%n%,.3f " + milePlural + " is equivalent to %,.2f " + kilometerPlural + ".", miles, kilometers);

//			double kiloConvert = sc.nextDouble();
//			System.out.println("Convert Kilometers to miles: " + convObj.milesToKilometers(kiloConvert));
	}

	double KilometersToMiles(double kilometers){
		//(distance in miles) ≈ 0.6 * (distance in kilometers) 
		double miles = kilometers / 1.6;
		return miles;
	}
}
