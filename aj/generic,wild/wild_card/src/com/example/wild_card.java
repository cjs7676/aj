package com.example;

import java.util.Arrays;
import java.util.List;

public class wild_card {
	//upper bounded


		private static double sum(List<? extends Number>list) 
		{
		double sum=0.0;
		
	for(Number i:list) 
		{sum=sum + i.doubleValue();}
		return sum;
		}
		
		//lower bounded


		private static void show(List<? super Integer>list) 
		{
		list.forEach((x)->{
			System.out.print(x+" ");
			});
		}


		public static void main(String[] args) {
			
			System.out.println("Upper Bounded:");
			List <Integer>l_1=Arrays.asList (5,3,7,4,2,6);
			System.out.println("List 1 Sum:"+sum(l_1));
			
			List <Double>l_2=Arrays.asList (5.2,3.4,7.3,4.4,2.5,6.2);
			System.out.println("List 2 Sum:"+sum(l_2));
			
			System.out.println("\n lower Bounded:");
			List <Integer>l_3=Arrays.asList (5,3,7,4,2,6);
			System.out.println("Only classes with Integer Suuperclass will be Accepted:");
			show(l_3);
		}

}
