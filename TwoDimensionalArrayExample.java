package com.example.training2.twodimensionalarrays;
//Example of two dimensional array
public class TwoDimensionalArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[][] mat= {{10,20,30},{40,50,60},{70,80,90}};
     for(int i=0;i<mat.length;i++)
     {
    	 for(int j=0;j<mat.length;j++)
    	 {
    		 System.out.print(mat[i][j]+" ");
    	 }
    	 System.out.println();
     }
    

}
}
/*
10 20 30 
40 50 60 
70 80 90 
*/