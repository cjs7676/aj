package com.example;

class test<t>
{
 t obj;
 test(t obj)
{this.obj=obj;}
 	 public t getobject()
{return this.obj;}
}


public class generic_class {
	public static void main(String[]args)
	{
  test<Integer>iobj=new test<Integer>(46);
	  System.out.println("the value of Integer is:"+iobj.getobject());
	
	  test<String>sobj=new test<String>("chirag");
	  System.out.println("the value of String is:"+sobj.getobject());


	 }

}
