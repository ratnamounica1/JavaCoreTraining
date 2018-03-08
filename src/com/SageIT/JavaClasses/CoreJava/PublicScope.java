package com.SageIT.JavaClasses.CoreJava;

public class PublicScope {
	  public void msg(){
		  System.out.println("Hello");
	  }
}

 class print{
  public static void main(String args[]){
	  PublicScope obj = new PublicScope();
    obj.msg();
  }
}
