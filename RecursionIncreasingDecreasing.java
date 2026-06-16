package com.example.recurssion;

import java.util.Scanner;

public class RecursionIncreasingDecreasing {

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
    	 System.out.println(n+" ");//Reverse order
    	 print(n-1);
    	 System.out.println(n+" ");//Straight order
     }
}
/*output
Enter a number:
5
5 
4 
3 
2 
1 
1 
2 
3 
4 
5 
*/