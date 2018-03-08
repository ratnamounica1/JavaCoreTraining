package com.SageIT.JavaClasses.CoreJava;

public class Protected {
	  protected void msg(){
		  System.out.println("Hello");
	  }

}

class Access extends Protected{
  public static void main(String args[]){
	  Access obj = new Access();
    obj.msg();
  }
}