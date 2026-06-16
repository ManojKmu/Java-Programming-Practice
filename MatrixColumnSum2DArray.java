package com.example.training2.twodimensionalarrays;
//Perform the matrix column sum
public class MatrixColumnSum2DArray {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	    int[][] mat= {{10,20,30},{40,50,60},{70,80,90}};
	    for(int i=0;i<mat.length;i++)
	    {
	    	int sum=0;
	   	 for(int j=0;j<mat.length;j++)
	   	 {
	   		 sum+=mat[j][i];
	   	 }
	   	 System.out.println(sum);
	    }
		}

	}
/*   
120
150
180
*/