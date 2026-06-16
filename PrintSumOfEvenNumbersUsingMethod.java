package com.ecxample.training5.methods;
//We print the even count sum in array by using method
public class PrintSumOfEvenNumbersUsingMethod {
     public static int sum(int nums[])
     {
    	 int sum=0;
    	 for(int ele:nums)
    	 {
    	 if(ele%2==0)
    	 {
    		 sum=sum+ele;
    	 }
    	 }
    	 return sum;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int nums[]= {2,3,4,5,6};
    System.out.println("The even count sum is :"+sum(nums));
	}

}
/*
The even count sum is :12  */