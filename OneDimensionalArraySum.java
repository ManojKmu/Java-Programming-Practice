package com.example.training2.onedimensionalarrays;

public class OneDimensionalArraySum {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {3,4,5,6,7};//int arr[]=new int[n]
         int n=arr.length;
		int sum=0;
    for(int i=0;i<n;i++) {
    	sum+=arr[i];
    	
    }
    System.out.println("The array sum is:"+sum);
	}

}
/*
The array sum is:25
*/