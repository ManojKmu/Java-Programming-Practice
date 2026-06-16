package com.example.training2.onedimensionalarrays;
//From the array element we need to find the first maximum element


public class ArrayFirstMaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr= {12,23,34,13,45};
   int max=arr[0];
   for(int i=1;i<arr.length;i++)
   {
	   if(arr[i]>max)
	   {
		  
		   max=arr[i];
	   }
   }
 System.out.println("The maximum element is:"+max);
	}

}
/*
The maximum element is:45
*/