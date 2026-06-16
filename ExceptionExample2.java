package com.example.training.oop;

public class ExceptionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //Null pointer Exception	
   String s="bits";
   try {
       System.out.println(s.length());
   } catch(Exception e)
   {
	   System.out.println("Exception occured");
   } finally {
	   System.out.println("monday");
   }
 //
	}

}
