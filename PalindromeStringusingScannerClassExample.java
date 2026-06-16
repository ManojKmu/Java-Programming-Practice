package com.example.training4.String;
//Palindrome String using the scanner class
import java.util.Scanner;

public class PalindromeStringusingScannerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a string:");
      String s=sc.next();
      int len=s.length();
      String rev="";
      for(int i=len-1;i>=0;i--)
      {
    	  rev+=s.charAt(i);
      }
      if(rev.equals(s))
      {
    	  System.out.println("Palindrome number");
      }   else {
    	  System.out.println("not a palindrome number");
      }
      sc.close();
	}

}
/*
Enter a string:

mom
Palindrome number
*/