package com.example;

interface Concatenator{
	String concatenate( String s1,String s2);
}
public class demo{


	public static void main(String[] args) {
		String str1 ="hello";
		String str2 ="chirag";
		Concatenator concatenator =(s1,s2) -> s1+s2;
		String result = concatenator.concatenate(str1,str2);
		System.out.println(result);
}
}
