package com.SageIT.JavaClasses.CoreJava;

interface Example_Interface
{

	public void method1();
	public void method2();
}
class Demo implements Example_Interface
{
	public void method1()
	{
		System.out.println("implementation of method1");
	}
	public void method2()
	{
		System.out.println("implementation of method2");
	}
	public static void main(String arg[])
	{
		Example_Interface obj = new Demo();
		obj.method1();
	}
}