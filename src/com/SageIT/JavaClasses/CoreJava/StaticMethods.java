package com.SageIT.JavaClasses.CoreJava;


class StaticMethods{
	  static int i = 100;
	  static String s = "mounica";
	  static void display()
	  {
	     System.out.println("i:"+i);
	     System.out.println("i:"+s);
	  }

	  void funcn()
	  {
	      display();
	  }
	  public static void main(String args[])
	  {
		  StaticMethods obj = new StaticMethods();
		  obj.funcn();
		  
	      display();
	   }
	}