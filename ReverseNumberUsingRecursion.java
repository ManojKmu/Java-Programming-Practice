package com.example.recurssion;

import java.util.Scanner;

public class ReverseNumberUsingRecursion {
  static void reverse(int n)
  {
	  int originalNum=n;
	  int rev=0;
	  while(n>0)
	  {
		  int rem=n%10;
		  rev=rev*10+rem;
		  n/=10;
	  }
	  System.out.println("The reverse of a given number "+ originalNum + " is: "+rev);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    reverse(n);
    sc.close();
	}

}
/* Enter a number:
123
The reverse of a given number 123 is: 321
*/