package com.SageIT.JavaClasses.CoreJava;

abstract class Abstract_Example{
   public void method1(){
     System.out.println("Concrete method of parent class");
   }
   abstract public void method2();
}

class test extends Abstract_Example{
 
   public void method2()
   {
       System.out.println("overriding abstract method");
   }
   public static void main(String args[]){
	   test obj = new test();
       obj.method2();
   }
}