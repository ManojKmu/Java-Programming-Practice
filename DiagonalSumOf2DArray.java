package com.example.training2.twodimensionalarrays;
//We perform the diagonal sum of 2D array for a given array
public class DiagonalSumOf2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[][]= {{1,2},{1,2}};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
        	sum+=arr[i][i];//primary diagonal
        	sum+=arr[i][n-1-i];//secondary diagonal
        	
        }
        System.out.println("The sum of diagonal is:"+sum);
	}

}
/*
The sum of diagonal is:6
*/