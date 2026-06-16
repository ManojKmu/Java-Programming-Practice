package com.example.training1;
//To check whether a number is armstrong or not
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int num=sc.nextInt();
	    int temp=num;
	    int temp1=num;
	    int count=0; 
	    while(num>0)
	    {
	    	int rem=num%10;
	    	count++;
	    	num/=10;
	    }
	   int sum=0,base;
	   while(temp>0)
	   {
		  
		   base=temp%10;
		  sum+=Math.pow(base, count);
		  temp/=10;
	   }
	    if(sum==temp1)
	    {
	    	System.out.println("Armstrong Number");
	    }  else {
	    	System.out.println("Not a armstrong  number");
	    }
	    sc.close();
	}

}
/*
  Run-1:
  Enter a number:
153
Armstrong Number
Run-2:
Enter a number:
1236
Not a Armstrong  number

*/  
