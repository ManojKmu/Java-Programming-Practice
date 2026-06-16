package com.example.training4.String;
//For a given String combination of aplhanumeric we need to sum the digits and print the result
public class ForAStringAlphaNumericPerformDigitsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="a1s2c5d8";
   //int num=Integer.parseInt(s);
   //System.out.println(num);
   int sum=0;
   for(char c:s.toCharArray())
   {
	   if(c>='0' && c<='9')
	   {  
	    sum+=(int)c-48;//we subtracting 48 because it's value is 0
	  
	   }
   }
   System.out.println("The sum of digits are:"+sum);
	}
}
/*
The sum of digits are:16
*/