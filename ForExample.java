package com.example.training1;
//TO print the multiplication table using for loop
import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number ");
     int num=sc.nextInt();
     for(int i=1;i<=10;i++)
     {
    	 
    	 num=num*i;
    	 System.out.println(num+" * "+i+" = : "+num);
     }
     
	}

}
