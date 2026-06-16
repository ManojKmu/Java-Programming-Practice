package com.example.recurssion;

import java.util.Scanner;
//here gcd means hcf
public class GcdOfTwoNumbers2 {
  public static int gcd(int a,int b)
  {
	  for(int i=Math.min(a, b);i>=1;i--)
	  {
		  if(a%i==0 && b%i==0) {
			  return i;
		  }
	  }
	  return 1;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number:");
   int a=sc.nextInt();
   int temp=a;
   System.out.println("Enter another number:");
   int b=sc.nextInt();
   int temp1=b;
   System.out.println("The numbers of "+temp+ " and "+temp1+" are: "+gcd(a,b) );
	}

}
/*output 
Enter a number:
12
Enter another number:
16
The numbers of 12 and 16 are: 4
*/