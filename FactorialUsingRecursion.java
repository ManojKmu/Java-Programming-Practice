package com.example.recurssion;

import java.util.Scanner;

public class FactorialUsingRecursion {
   public static int fact(int n)
   {
	   if(n==1||n==0 ) return n;
	   else
		   return n*fact(n-1);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    System.out.println("The factorial of a given number "+ n + " is: "+fact(n));
    sc.close();
	}

}
