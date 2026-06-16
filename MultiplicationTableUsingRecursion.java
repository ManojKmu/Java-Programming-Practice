package com.ecxample.training.recursion;

import java.util.Scanner;

public class MultiplicationTableUsingRecursion {
public static void calc(int num)
{  

	for(int i=1;i<=10;i++)
	{
		if(num>0)
		  System.out.println(num+ " * " +i+ " = " +(num*i));
		
	}
}
	public static void main(String[] args) {
		//  TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
  calc(num);
	}

}
