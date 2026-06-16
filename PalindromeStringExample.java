package com.example.training4.String;
//Program to print the palindrome name from a given string
public class PalindromeStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name="malayalam";
     int len=name.length();
     String rev="";
     for(int i=len-1;i>=0;i--)
     {
    	 rev+=name.charAt(i);
     }
  
      if(name.equals(rev))
      {
    	  System.out.println("Palindrome Number");
      }  else {
    	  System.out.println("Not a Palindrome Number");  
      }
	}

}
/*
Palindrome Number
*/