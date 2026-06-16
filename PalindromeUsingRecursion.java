package com.ecxample.training.recursion;

import java.util.Scanner;

public class PalindromeUsingRecursion {
public static void palindrome(int n)
{
	int temp=n;
	int rev=0;
	while(n>0)
	{
		int rem=n%10;
		rev=rev*10+rem;
		n/=10;
	}
	if(rev==temp)
	{
		System.out.println("Palindrome number");
	}  else {
		System.out.println("not a palindrome number");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number:");
     int n=sc.nextInt();
     palindrome(n);
     sc.close();
	}

}
/* 
Enter a number:
121
Palindrome number
*/