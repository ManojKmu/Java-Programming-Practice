package com.example.recurssion;

import java.util.Scanner;
//The power of a number is done usin recursion without built in function Math.pow
public class PowerLinearWIthRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Base value:");
    int a=sc.nextInt();
    System.out.println("Enter the power value:");
    int b=sc.nextInt();
    System.out.println(a+" value of power is raised "+b+" to : "+pow(a,b));
	}
public static int pow(int a,int b)
{
	if(b==0) return 1;
	return a*pow(a,b-1);
}
}
