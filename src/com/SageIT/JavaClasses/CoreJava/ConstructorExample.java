package com.SageIT.JavaClasses.CoreJava;

public class ConstructorExample {
	private String name;
	private int age;
	public ConstructorExample() {  
		this.name = "Unknown";
		this.age = 0;
	}
	public ConstructorExample(String Name) {
		this.name = Name;
		this.age = 0;
	}
	public ConstructorExample(String Name, int Age) {
		this.name = Name;
		this.age = Age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public static void main(String args[]) {
		ConstructorExample CE1 = new ConstructorExample();
		ConstructorExample CE2 = new ConstructorExample("Jim");
		ConstructorExample CE3 = new ConstructorExample("John", 28);
		System.out.println("CE1: " + CE1.getName() +" is "+ CE1.getAge() + " years old.");
		System.out.println("CE2: " + CE2.getName() +" is "+ CE2.getAge() + " years old.");
		System.out.println("CE3: " + CE3.getName() +" is "+ CE3.getAge() + " years old.");
	}
}
