package com.example.strings;

public class InterningNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1=new String("manoj");
      String s2=new String("manoj");
      System.out.println(s1==s2);//false because it compares locations of s1 and s2
      System.out.println(s1.equals(s2));//true 
      System.out.println(s1.charAt(0)==s2.charAt(0));//true
      String s3="Kumar";
      String s4="Kumar";
      System.out.println(s3==s4);//true
	}

}
