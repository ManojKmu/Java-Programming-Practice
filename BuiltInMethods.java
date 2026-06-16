package com.example.strings;

public class BuiltInMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="Manoj is a smart";
     System.out.println(str.indexOf('a'));//indexof tells the position of a index value
     System.out.println(str.indexOf(' '));//it prints as 5
     System.out.println(str.lastIndexOf('a'));//13
     System.out.println(str.toUpperCase());//MANOJ IS A SMART
     System.out.println(str.length());
     String str2=" in college";
     System.out.println(str.concat(str2));//Manoj is a smart in college
     System.out.println(str.replace(str, str2));//in college
     String str3="Manoj Is A Smart";
     System.out.println(str.toLowerCase());//manoj is a smart
     System.out.println(str3.contains("Manoj"));//true
     System.out.println(str3.startsWith("Man"));//true
     System.out.println(str3.startsWith("anoj"));//false
     String str4="Manojkumar";
     String str5="Manoj";
     System.out.println(str5.compareTo(str4));//-5
     System.out.println(str4.compareTo(str5));//5
     System.out.println("Manoj"+10+20);//Manoj1020
     System.out.println('A'+"gadu");//Agadu
     System.out.println('A'+2+"Manoj");//67Manoj
	}

}
