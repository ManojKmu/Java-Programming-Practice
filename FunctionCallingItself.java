package com.example.recurssion;

public class FunctionCallingItself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   print(1);
	}
	public static void print(int n)
	{
		if(n==5) return;
		System.out.println("My name is print method");
		print(n+1);
	}

}
