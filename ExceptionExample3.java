package com.example.training.oop;

public class ExceptionExample3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub/
		//ArrayIndexOutOfBoundsException
   int arr[]= {2,3,4,6};
   try {
   System.out.println(arr[4]);
   } catch(ArrayIndexOutOfBoundsException aiobe)
   {
	   System.out.println("The array index cannot accessed beyond limit");
   }   finally {
	   System.out.println("example");
   }
	}

}
