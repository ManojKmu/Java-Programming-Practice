package com.example.training2.onedimensionalarrays;
//Given array we need to find the second maximum element
public class ArraySecondMaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,23,34,13,45};
		int firstMax=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		for(int ele:arr)
		{
			if(ele>firstMax)
			{
				secondMax=firstMax;
				firstMax=ele;
			}   else if(ele>secondMax||ele!=firstMax)
			{
				secondMax=ele;
			}
		}

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second maximum element found.");
        } else {
            System.out.println("Second maximum element = " + secondMax);
        }
	}

}
/* Second maximum element = 34*/