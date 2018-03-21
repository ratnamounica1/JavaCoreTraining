package com.SageIT.JavaClasses.CoreJava;

public class Hashcode_Equals {
	public static void main(String[] args) {
		Object_BeanStudent alex1 = new Object_BeanStudent(1, "Alex");
		Object_BeanStudent alex2 = new Object_BeanStudent(1, "Alex");
		System.out.println("alex1 hashcode = " + alex1.hashCode());
		System.out.println("alex2 hashcode = " + alex2.hashCode());
		System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
	}
}