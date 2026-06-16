package com.example.training1;

import java.util.Scanner;

public class CheckPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      int num=sc.nextInt();
      if(num>0)
      {
    	  System.out.println("Positive number");
      }    else {
    	  System.out.println("Negative Number");
      }
      sc.close();
	}

}
