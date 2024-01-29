package com.example;

import java.util.HashSet;
import java.util.Set;
public class set {
	public static void main(String[] args) {
		Set<String>set1=new HashSet<>();
		set1.add("sujit");
		set1.add("arun");
		set1.add("chirag");
		set1.add("rohit");
		set1.add("sourabh");
		System.out.println("set1:"+set1);
		
		Set<String>set2=new HashSet<>();
		set2.add("sumit");
		set2.add("ritik");
		set2.add("raj");
		set1.addAll(set2);
		System.out.println("set1 after adding item fromset2:"+set1);
		set1.remove("ritik");
		System.out.println("set1 after removing ritik:"+set1);
		boolean isPresent=set1.contains("rajesh");
		System.out.println("is rajesh present in set1?"+isPresent);
		}
	}


