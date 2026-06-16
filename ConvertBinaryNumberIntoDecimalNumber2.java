package com.ecxample.training.recursion;

public class ConvertBinaryNumberIntoDecimalNumber2 {
   public static int bin2dec(int n)
   {
	   int sum=0,e=0,val;
	   while(n>0)
	   {
		   int rem=n%10;
		   val=rem*((int)Math.pow(2, e));
		   sum+=val;
		   e++;
		   n/=10;
	   }
	   return sum;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("The decimal value is: "+bin2dec(1011));
	}

}
/*
The decimal value is: 11
*/