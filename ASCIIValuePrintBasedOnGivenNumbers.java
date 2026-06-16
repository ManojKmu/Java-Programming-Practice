package com.example.training4.String;

import java.util.Scanner;

public class ASCIIValuePrintBasedOnGivenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a character");
      char ch=sc.next().charAt(0);
      System.out.println((int)ch);//Type casting
	}

}
/*
Enter a character
A
65
*/