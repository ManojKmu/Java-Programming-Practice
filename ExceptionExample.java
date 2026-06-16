package com.example.training.oop;
//Arithmetic Exception
public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Exception Concepts");
    int a=10;
    int b=0;
    try {
    	System.out.println(a/b);
    }  catch(Exception e)
    {
    	System.out.println("Cannot divide by zero");
    }  finally{
    	System.out.println("Closed the connection");
    }
    System.out.println("Handled");
	}

}
