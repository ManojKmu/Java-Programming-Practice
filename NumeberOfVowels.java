package com.example.strings;

import java.util.Scanner;

public class NumeberOfVowels {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			String str=sc.nextLine();
			   int count=0;
			   for(int i=0;i<str.length();i++)
			   {
				   char ch=str.charAt(i);
				     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				     {
				    	 count++;
				     }
			   }
			   System.out.print("The vowels count are"+count);
		}
	}

}
