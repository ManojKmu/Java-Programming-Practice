package com.ecxample.training5.methods;

import java.util.Scanner;

public class AreaOfaCirceUsingMethod {
   public static float area(int radius)
   {
	   float pi=3.14f;
	   return pi*radius*radius;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the radius value:");
   int radius=sc.nextInt();
   System.out.println("The area of a circle is:"+area(radius));
   sc.close();
	}

}
/*
Enter the radius value:
3
The area of a circle is:28.26  */