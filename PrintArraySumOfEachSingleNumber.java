package com.example.training2.onedimensionalarrays;
//We need to perform the sum operation for each and every digit number like 54->5+4=9
public class PrintArraySumOfEachSingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {54,93,12,65};
    
        for(int i=0;i<arr.length;i++)
        {
        	int temp=arr[i];
        	int sum=0;
        	while(arr[i]>0)
        	{
        		int rem=arr[i]%10;
        		sum+=rem;
        		arr[i]=arr[i]/10;
        	}
        	System.out.println("The sum of element "+temp+" is:"+sum);
        }
 	}

}
/*
The sum of element 54 is:9
The sum of element 93 is:12
The sum of element 12 is:3
The sum of element 65 is:11
*/