package com.ecxample.training5.methods;
//To print the odd count from a array 
public class PrintSumOfOddNumbersUsingMethod {
    public static int oddArraySum(int num[]) {
    	int sum=0;
    	for(int ele:num)
    	{
    		if(ele%2==1)
    		{
    			sum+=ele;
    		}
    	}
    	return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num[]= {2,3,4,5,6};
	 System.out.println("The odd count sum is :"+oddArraySum(num));

	} 

}
/*
The odd count sum is :8   */