package com.example.recurssion;

import java.util.Scanner;

public class PowerLinearWIthoutRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a Base value:");
     int a=sc.nextInt();
     System.out.println("Enter the power value:");
     int b=sc.nextInt();
     System.out.println(a+" value is raised to power "+ b + " is "+Math.pow(a, b));
	}

}
