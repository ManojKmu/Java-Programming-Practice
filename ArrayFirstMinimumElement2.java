package com.example.training2.onedimensionalarrays;
//Given an array we need to find the first mininmum element
public class ArrayFirstMinimumElement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,23,34,13,45};
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<max)
			{
				max=arr[i];
			}
		}
		System.out.println("The minimum element is:"+max);
	}

}
/*
The minimum element is:12
*/