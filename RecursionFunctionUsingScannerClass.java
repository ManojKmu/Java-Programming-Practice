package com.example.recurssion;

import java.util.Scanner;

public class RecursionFunctionUsingScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
    print(n);
	}
	public static void print(int n)
	{
		if(n==0) return;
		System.out.println(n+" ");//TO print the numbers in  a reverse order
		print(n-1);
		//System.out.println(n+" "); //here this print will print the values in straight order after print stmt
	}

}
/*output
Enter a number:
5
5
4
3
2
1  */