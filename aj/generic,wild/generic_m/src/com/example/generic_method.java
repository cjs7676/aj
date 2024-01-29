package com.example;

public class generic_method {
	void display()
	{
	System.out.println(" generic method example");
	}
	<t> void gdisplay (t e)
	{
		System.out.println(e.getClass().getName()+"="+e);
	}


	public static void main(String[] args) {
		generic_method g1=new generic_method();


		g1.display();
		g1.gdisplay(136);
		g1.gdisplay("chirag");
		g1.gdisplay(9.2);

}

}
