package com.example.recurssion;

import java.util.Scanner;

public class SumOfNaturalNumbers {
      public static int sum(int n)
      {
    	  return n*(n+1)/2;
    	  
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      int n=sc.nextInt();
      int temp=n;
      System.out.println("The sum of the given number "+temp+" is: "+sum(n));
	}

}
/*output 
Enter a number:
5
The sum of the given number 5 is: 15
*/