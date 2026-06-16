package com.example.training2.twodimensionalarrays;

public class ReverseOfAMatrix2D {

	public static void main(String[] args) {		// TODO Auto-generated method stub
   int[][] mat= {{10,20,30},{40,50,60},{70,80,90}};
   for(int i=mat.length-1;i>=0;i--)
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
70 80 90 
40 50 60 
10 20 30 
*/