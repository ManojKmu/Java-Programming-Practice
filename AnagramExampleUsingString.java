package com.example.training4.String;
//Anagram means both string words should be same in any order
import java.util.Arrays;

public class AnagramExampleUsingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1="Man";
       String s2="anM";
       //convert to lowercase
       s1=s1.toLowerCase();
       s2=s2.toLowerCase();
       //if lengths are different not a anagram
       if(s1.length()!=s2.length())
       {
    	   System.out.println("Not Anagram");
    	   return;
       }
       ////Convert string to char array
       char[] arr1=s1.toCharArray();
       char[] arr2=s2.toCharArray();
       //sort the arrays
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       //compare
       if(Arrays.equals(arr1, arr2))
       {
    	   System.out.println("Anagram");
       }  else {
    	   System.out.println("Not a anagram");
       }
	}

}
/*

Anagram
*/