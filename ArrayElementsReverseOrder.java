package com.example.training2.onedimensionalarrays;
//Reverse the array element 
public class ArrayElementsReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr= {5,6,7,8,9};
   for(int i=arr.length-1;i>=0;i--)
   {
	   System.out.print(arr[i] + " ");//Concatenation to give spaces b/w every element
   }
	}

}
/*
9 8 7 6 5 
*/