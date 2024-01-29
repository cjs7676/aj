package com.example;

interface calculator{
	int calculate(int x, int y);
}
public class demo {


	public static void main(String[] args) {
		calculator add=(x,y) -> x+y;
		calculator subtract=(x,y)-> {return x-y ;};
		
		int sum = add.calculate(125678, 56345);
		int difference =subtract.calculate(190, 56);
		
		System.out.println(" The sum is " +sum);
		System.out.println(" The difference is " +difference);
		}
}
