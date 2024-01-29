package com.example;
import java.util.Arrays;
import java.util.List;
public class demo {
	public static void main(String[] args) {
		List<String> names =Arrays.asList(" sujit" ,"chirag", "rohit", "arun");
		names.forEach(name-> System.out.println("hello " + name + "!"));
	}
}
