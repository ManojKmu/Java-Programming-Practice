package com.example.training2.twodimensionalarrays;
//In a 2D array matrix we have to find the cross diagonals on left and right side
public class CrossDiagonalSumOf2DArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[][] mat= {{10,20,30},{40,50,60},{70,80,90}};
    int leftSum=0,rightSum=0;
    for(int i=0;i<mat.length;i++)
    {
   	 for(int j=0;j<mat.length;j++)
   	 {   
   		 //nested if loop
   		 if(i+j==mat.length-1) {
   		 leftSum+=mat[i][j];
   		 }     
   		 if(i+j==mat.length-1) {
   	   		 rightSum+=mat[i][j];
   	   		 }  
   	 }
    }
    System.out.println("The left sum is:"+leftSum);
    System.out.println("The right sum is:"+rightSum);
    int wholeSum=leftSum+rightSum;
    System.out.println("The total sum is:"+wholeSum);
	}

}
/*
The left sum is:150
The right sum is:150
The total sum is:300
*/