package com.ecxample.training.recursion;

import java.util.Scanner;

public class SumOfNNaturalNumbersUsingrecursion {
    public static int sum(int num)
    {
    	return num*(num+1)/2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number:");
     int num=sc.nextInt();
     System.out.println("The sum of " +num+" natural numbers is:"+sum(num));
     
	}

}
/* 
Enter a number:
5
The sum of 5 natural numbers is:15
*/