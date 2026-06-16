package com.example.workshop;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
      int num,rem,sum=0;
      System.out.println("Enter a number:");
      num=sc.nextInt();
      while(num>0)
      {
    	  rem=num%10;
    	  sum=sum+rem;
    	  num/=10;
      }
      System.out.println("The sum is : "+sum);
      sc.close();
	}

}
