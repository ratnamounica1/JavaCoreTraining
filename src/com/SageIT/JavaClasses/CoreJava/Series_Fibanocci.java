package com.SageIT.JavaClasses.CoreJava;
import java.util.Scanner;

public class Series_Fibanocci {

   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter the value of n: ");
       int n = s.nextInt();
       for (int i = 0; i <= n; i++) {
           System.out.print(fibonacci(i) + " ");
       }
   }

   public static int fibonacci(int n) {
       if (n == 0) {
           return 0;
       } else if (n == 1) {
           return 1;
       } else {
           return fibonacci(n - 1) + fibonacci(n - 2);
       }
   }
}
