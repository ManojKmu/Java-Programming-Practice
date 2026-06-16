package com.ecxample.training5.methods;

public class PrintSumOfOddNumbersUsingMethodPerformMultiplication {
	public static int oddArraySum(int num[]) {
    	int product=1;
    	for(int ele:num)
    	{
    		if(ele%2==1)
    		{
    			product*=ele;
    		}
    	}
    	return product;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num[]= {2,3,4,5,6};
	 System.out.println("The product of odd number is :"+oddArraySum(num));

	}

}
/*
The product of odd number is :15   */