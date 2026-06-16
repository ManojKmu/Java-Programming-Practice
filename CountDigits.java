package com.example.strings;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");//0004566
    int n=sc.nextInt();
    String s=" "+n;
    System.out.println(s.length());//5
    System.out.println("Enter a double value:");//000.045600
    double d=sc.nextDouble();
    String s2=" "+d;
    System.out.println(s2.length());//7
    String str="76564";
    int n1=Integer.parseInt(str);
    System.out.println(n1+1);//76565
    sc.close();
	}

}
