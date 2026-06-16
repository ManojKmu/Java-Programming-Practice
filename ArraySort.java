package com.example.training2.onedimensionalarrays;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {2,6,9,1,0};
     Arrays.sort(arr);
     System.out.println(arr);//[I@6f539caf(It prints address)
     System.out.println(Arrays.toString(arr));//Array.toString(arr) to print the value in human language
	}

}
/*
[0, 1, 2, 6, 9]
*/