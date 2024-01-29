package com.example;
import java.util.ArrayList;
public class array1 {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("MATHS");
		list.add("ADBMS");
		list.add("JAVA");
		list.add("PYTHON");
		System.out.println(list);
		System.out.println("Traversing listt Through for each loop");
		for(String subject:list)
		System.out.println(subject);
		}
	}
