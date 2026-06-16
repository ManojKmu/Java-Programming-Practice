package com.ecxample.training5.methods;

public class PrintSumOfEvenNumbersUsingMethodPerformMultiplication {
public static int mul(int num[])
{
	int product=1;
	for(int ele:num)
	{
		if(ele%2==0)
		{
			product*=ele;
		}
	}
	return product;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num[]= {2,3,4,5,6};
     System.out.println("The even number multiplication is:"+mul(num));
	}

}
/*
The even number multiplication is:48
*/