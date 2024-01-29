package com.example;

import java.util.Map;
import java.util.HashMap;
public class test {
public static void main(String[] args) {
	Map<Integer,String>map1 =new HashMap<>();
	map1.put(1,"sujit");
	map1.put(2,"sumit");
	map1.put(3,"rohit");
	map1.put(4,"vijay");
	map1.put(5,"chirag");
	System.out.println("Map1:"+map1);


	Map<Integer,String>map2 =new HashMap<>();
	map2.put(6,"suresh");
	map2.put(7,"ajay");
	map2.put(8,"niraj");
	map1.putAll(map2);
	System.out.println("Map1 after adding item formap2:" +map1);
	map1.remove(3);
	System.out.println("map1 after removing key 3:"+map1);
	boolean isPresent=map1.containsKey(4);
	System.out.println("Is key 4 present in map1?"+isPresent);
	String value=map1.get(2);
	System.out.println("the value of key 2 is:"+ value);
	System.out.println("\nprinting All keys and values Of map1:");
	for(Map.Entry<Integer,String>entry:map1.entrySet())
	{
		System.out.println("key:"+entry.getKey()+",Value:"+entry.getValue());
	}
	}
}

