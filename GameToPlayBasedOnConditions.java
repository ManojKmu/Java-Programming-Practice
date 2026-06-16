package com.example.training1;

import java.util.Scanner;

public class GameToPlayBasedOnConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the temperature as low,medium and high only:");
   String temp=sc.next();
   if(temp.equals("high"))//To compare the two strings we use dot equals operator but for integer we use the compares operator
   {
	 System.out.println("He cannot play the game");  
   } else if(temp.equals("medium"))
   {
	   System.out.println("Enter the cloudy value as true or false");
	   boolean cloudy=sc.nextBoolean();
	   if(cloudy==true)
	   {
		   System.out.println("He can play the game"); 
	   }  else {
		   System.out.println("He can play the game"); 
	   }
   } else {
	   System.out.println("Enter the rainy value as true or false");
	   boolean rainy=sc.nextBoolean();
	   if(rainy==true)
	   {
		   System.out.println("He cannot play the game"); 
	   } else {
		   System.out.println("He can play the game"); 
	   }
   }
   sc.close();
	}

}
