package com.ecxample.training.recursion;
//In fibonacci series we perform the previous value sum operation
import java.util.Scanner;

public class FibonacciNumberUsingRecursion {
    public static int fibonacci(int n)
    {
    	if(n==1||n==0) return n;
    	else
    		return fibonacci(n-1)+fibonacci(n-2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:");
       int n=sc.nextInt();
       System.out.println("The fibonacci number is:"+fibonacci(n));
	}

}
/*
Enter a number:
5
The fibonacci number is:5 */