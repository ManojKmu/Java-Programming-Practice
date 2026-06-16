package com.example.training4.String;

import java.util.Arrays;

public class BuiltInMethodsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String name="Manoj";
   //1)Upper case String
     System.out.println(name.toUpperCase());//MANOJ
     //2)Lower case String
     System.out.println(name.toLowerCase());
     //3)TO char array in string(It converts it into array)
     String s="kumar";
     char[] character=s.toCharArray();
     for(char ch:character)
     {
    	 System.out.print(ch+" ");//k u m a r
     }
     //4)Convert arrays into string we use 
     char c[]= {'a','p','p','l','e'};
//     c.toString();
     System.out.println(Arrays.toString(c));//[a, p, p, l, e]
     //String.valueOf() method it convert the array into string
     System.out.println(String.valueOf(c));//apple
     //Interview questions diff about equals and compare in string object
     String s1=new String("Hello");
     String s2=new String("Hello");
     System.out.println(s1==s2);//To check the address//false
     System.out.println(s1.equals(s2));//TO chech the data//true
     //String literals diff b/w comparison  and  equals
     String s3="Hello";
     String s4="Hello";
     System.out.println(s3==s4);//true
     System.out.println(s3.equals(s4));//true
     //Below exapmle imp for concatention
     String s8="bits";
     s8+="college";
     System.out.println(s8);//bitscollege
     //5)Sub string(part of a string)
     String s9="water";
     System.out.println(s9.substring(0, 2));//wa
     System.out.println(s9.substring(1));//ater
     //6) isEmpty() method check the  string
     System.out.println(s9.isEmpty());//false
     System.out.println(s9.indexOf('a'));//1
     System.out.println(s9.indexOf('k'));//-1
     //7) contains() method is used to check the string present or not in original string
     String fruit="Mango";
     System.out.println(fruit.contains("Man"));//true
     System.out.println(fruit.contains("Am"));//false
     System.out.println(fruit.startsWith("M"));//true
     System.out.println(fruit.endsWith("o"));//true
	}

}
