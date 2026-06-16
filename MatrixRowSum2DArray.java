package com.example.training2.twodimensionalarrays;
//Sum of each rows of a matrix
public class MatrixRowSum2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[][] mat= {{10,20,30},{40,50,60},{70,80,90}};
    for(int i=0;i<mat.length;i++)
    {
    	int sum=0;
   	 for(int j=0;j<mat.length;j++)
   	 {
   		 sum+=mat[i][j];
   	 }
   	 System.out.println(sum);
    }
	}

}
/*  
 60
210
450
*/