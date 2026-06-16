package com.ecxample.training5.methods;

import java.util.Scanner;

public class MethodsUsingScannerClass {
    public static void message(String name)
    {
    	System.out.println("Hello "+name);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter your name:");
   String name=sc.next();
   message(name);
   sc.close();
	}

}
/*
Enter your name:
Manoj
Hello Manoj
*/