package com.example.recurssion;

import java.util.Scanner;
//here gcd means hcf
public class GcdOfTwoNumbers {
  public static int gcd(int a,int b)
  {
	  int hcf=1;
	  for(int i=1;i<Math.min(a, b);i++)
	  {
		  if(a%i==0 && b%i==0) {
			  hcf=i;
		  }
	  }
	  return hcf;
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