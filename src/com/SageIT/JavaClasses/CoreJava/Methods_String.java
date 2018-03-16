package com.SageIT.JavaClasses.CoreJava;

public class Methods_String{
	   public static void main(String args[]){
	       String str = new String("Game of Thrones");
	       char[] array= str.toCharArray();
	       System.out.print("Characters in Series: ");
	       for(char c: array){
	           System.out.print(c);
	       }
	       System.out.println(str.isEmpty());
	       System.out.println(str.substring(8,14));
	       System.out.println(str.charAt(11));
	       System.out.println("Index of m in str: "+str.indexOf('m'));
	       System.out.println(str.replace('o', '*'));

	       String str1 = new String("28/11/1992");
	       String array1[]= str1.split("/");
	       for (String temp: array1){
	          System.out.println(temp);
	       }
	       System.out.println(str.toLowerCase());
	       System.out.println(str.toUpperCase());
	       System.out.println(str.subSequence(0, 10) );

	   }
	}