package com.example.strings;
import java.util.Scanner;
public class IntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a value or number:");
  int n=sc.nextInt();
  String s=" ";//Empty string to convert int to string
		 s=s+n;//One Method
		 s=Integer.toString(n);//2nd Method
		 System.out.println(s);//123
		 sc.close();
	}

}
