package com.example.recurssion;

import java.util.Scanner;

public class RecursionIncreasingDecreasingByRemovingOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
      print(n);
      sc.close();
	}
	public static void print(int n)
	{
		//TO avoid repeatation of 1 we use this if condition
		if(n==1)
			{
			System.out.println(n+" ");
			return;
			}
		System.out.println(n+" ");//reverse order
		print(n-1);
		System.out.println(n+" ");//Straight order
	
	}

}
/* output 
Enter a number:
5
5 
4 
3 
2 
1 
2 
3 
4 
5 
*/