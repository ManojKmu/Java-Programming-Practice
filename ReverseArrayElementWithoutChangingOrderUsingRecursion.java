package com.ecxample.training.recursion;

import java.util.Arrays;

public class ReverseArrayElementWithoutChangingOrderUsingRecursion {
  public static int reverseNumber(int num)
  {
	  int rev=0;
		  while(num>0)
		  {
			  int rem=num%10;
			  rev=rev*10+rem;
			  num/=10;
		  }
	  return rev;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr= {123,456,789};
   for(int i=0;i<arr.length;i++)
   {
	  arr[i] =reverseNumber(arr[i]);
   }
   System.out.println("Reversed Array is:"+Arrays.toString(arr));
	}

}
/*
Reversed Array is:[321, 654, 987]
*/
