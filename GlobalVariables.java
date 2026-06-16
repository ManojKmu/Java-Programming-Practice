package com.example.recurssion;

public class GlobalVariables {
     static int a=10;//Global variables
     static int b=20;
     static int c=a+b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int x=10;
     change(x);
     System.out.println(x);//10
  
	}
	public static void change(int x)
	{
		x=20;
		
	}
	 
}
