package com.example.training1;

import java.util.Scanner;

public class CrossStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    for(int i=0;i<num;i++)
    {
    	for(int j=0;j<num;j++)
    	{
    		if(i==j||i+j==num-1)
               {
	              System.out.print("*");
                } else {
                	System.out.print(" ");
                }
    	}
    	System.out.println();
    }
    sc.close();
	}

}
/*
Enter a number:
5
*   *
 * * 
  *  
 * * 
*   *
*/