package com.example.strings;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a string:");
     String str=sc.nextLine();//Manoj is a good boy
     System.out.println(str+" ");//Output : Manoj is a good boy
     System.out.println("Enter another string:");
     String str2=sc.next();//mango is sweet
     System.out.println(str2+" ");//mango
     sc.close();
	}

}
