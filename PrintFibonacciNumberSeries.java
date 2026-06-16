package com.ecxample.training.recursion;

import java.util.Scanner;

public class PrintFibonacciNumberSeries {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:");
       int n=sc.nextInt();
       int a=0,b=1;
       System.out.println("Fibonacci series:");
       for(int i=0;i<n;i++)
       {
    	System.out.print(a+" ");
    	int c=a+b;
    	a=b;
    	b=c;
       }
       sc.close();
	}

}
/*
Enter a number:
5
Fibonacci series:
0 1 1 2 3 
*/