package com.example.workshop;
import java.util.*;
public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:");
        int num=sc.nextInt();
        int rem,rev=0;
        while(num!=0)
        {
        	rem=num%10;
        	rev=rev*10+rem;
        	num/=10;
        }
        System.out.println("The reverse of a number is: "+rev);
	}

}
