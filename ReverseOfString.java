package com.example.training4.String;
//Printing the characters in reverse order of a string
public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name="Manoj";
     //In strings the length() should be in parentheses
     System.out.println(name.length());//5
     for(int i=name.length()-1;i>=0;i--)
     {
    	 System.out.print(name.charAt(i)+" ");//j o n a M 
     }
	}

}
