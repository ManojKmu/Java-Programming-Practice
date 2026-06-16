package com.example.training4.String;
//TO print the consonent count from a string
public class CountConsonentFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="Manoj";
      int len=s.length();
      int count=0;
      for(int i=0;i<len;i++)
      {
    	  if(!(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'))
    	  {
    		  count++;
    	  }
      }
      System.out.println("The consonent count is:"+count);
	}

}
/*
The consonent count is:3
*/