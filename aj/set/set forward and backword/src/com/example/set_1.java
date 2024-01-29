package com.example;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class set_1 {
	public static void main(String[]args)
	{
		List<String>name=new LinkedList<>();
		name.add("chirag");
		name.add("GNIMS");
		name.add("MCA");
		ListIterator<String>listIterator=name.listIterator();
		System.out.println("ForwardDirection Iterator:");
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
		}
		System.out.println("Backward Direction Iteration:");
		while(listIterator.hasPrevious()){
			System.out.println(listIterator.previous());
		}
	}


}

