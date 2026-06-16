package com.example.training4.String;
//Program to count the no.of vowels in a string
public class CountVowelsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String name="bitscollege";
         int len=name.length();
         int count=0;
         for(int i=0;i<len;i++)
         {
        	 if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
        	 {
        		 count++;
        	 }
         }
    	 System.out.println("The no.of vowels are:" + count);
	}

}
/*
The no.of vowels are:4     */