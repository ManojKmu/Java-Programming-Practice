package com.ecxample.training5.methods;

import java.util.Scanner;

public class FactorialUsingMethods {
    public static int factorial(int num)
    {
    	if(num==1||num==0) return num;
    	else 
    	 return num*factorial(num-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
     System.out.println("The factorial of a number is:"+factorial(num));
     sc.close();
	}

}
