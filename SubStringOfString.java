package com.example.strings;

public class SubStringOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="Manoj Kumar";
     System.out.println(s.substring(1,4));//ano
     System.out.println(s.substring(1,s.length()-1));//anoj Kuma
       String str="Kumar";
      for(int j=1;j<s.length();j++)
      {
    	  System.out.println(str.substring(0,j));
    	  /* output
    	  K
	  Ku
	  Kum
	  Kuma
	  Kumar*/
      }
	}

}
