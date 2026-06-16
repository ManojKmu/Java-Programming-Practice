package com.example.training2.twodimensionalarrays;

public class HollowPatternFor2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] mat= {{10,20,30},{40,50,60},{70,80,90}};
		    for(int i=0;i<mat.length;i++)
		    {
		   	 for(int j=0;j<mat.length;j++)
		   	 {
		   		 if(i==0||j==0||i==mat.length-1||j==mat.length-1)
		   		 {
		   			 System.out.print(mat[i][j] + " ");
		   		 }   else {
		   			 System.out.print("   ");
		   		 }
		   	 }
		 	System.out.println();
	       }
	}
}
/*
 10 20 30 
40    60 
70 80 90 
*/
