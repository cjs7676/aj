package com.example;

public class lamdaex {
	public static void main(String[] args) {
		Runnable helloworld=()->System.out.println("hello world");
		helloworld.run();
	}
}
