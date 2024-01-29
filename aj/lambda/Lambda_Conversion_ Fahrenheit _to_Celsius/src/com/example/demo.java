package com.example;
interface converter{
	double convert (double input);
}
public class demo{


	public static void main(String[] args) {
		 converter a = f ->(f-32)*5/9;
		 double celsius = a.convert(98);
		 System.out.println("98 degrees Fahrenheit is " + celsius + 
		 "degree celsius");


		 converter kilometersToMiles = km -> km/1.609344;
		 double miles = kilometersToMiles.convert(85);
		 System.out.println("85 kilometers is " + miles + "miles");
		}
}
