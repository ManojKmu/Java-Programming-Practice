package com.example.training1;
//Without using modules operator instead of BITWISE AND
import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a number:");
          int num=sc.nextInt();
          if((num & 1)==0) //if(num/2)*2==num or if(num >> 1)<<1==num
          {
        	  System.out.println("Even number");
          }  else System.out.println("Odd number");
	}
}
