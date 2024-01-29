package com.example;

	interface B
	{
		int add (int i, int j);
	}
	public class demo {


			public static void main(String[] args) {
			B obj =(i,j)-> i+j;
			int result = obj.add(6, 7);
			System.out.println(result);
			}
	}
