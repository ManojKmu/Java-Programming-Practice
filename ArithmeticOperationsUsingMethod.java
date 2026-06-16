package com.ecxample.training5.methods;
//when we use a return type in method we should return use print stmt 
import java.util.Scanner;

public class ArithmeticOperationsUsingMethod {
    public  static int add(int a,int b) {
    	    
    	 return a+b;
     }
    public  static int sub(int a,int b) {
	    
   	 return a-b;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number:");
    int a=sc.nextInt();
    System.out.println("Enter second number:");
    int b=sc.nextInt();
  
    System.out.println("Addition of two numbers is:"+add(a,b));
    System.out.println("Subtraction of two numbers is:"+sub(a,b));
	}

}
/*
Enter first number:
5
Enter second number:
2
Addition of two numbers is:7
Subtraction of two numbers is:3
*/