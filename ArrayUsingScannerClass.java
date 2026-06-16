package com.example.training2.onedimensionalarrays;
//Read the array elements from the user using the scanner class 
import java.util.Scanner;

public class ArrayUsingScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your array size:");
     int size=sc.nextInt();
     int[] arr=new int[size];
     for(int i=0;i<size;i++)
     {
    	 arr[i]=sc.nextInt();
     }
     System.out.println("The Elements are:");
     for(int i=0;i<size;i++)
     {
    	 System.out.println(arr[i]);
     }
     sc.close();
	}

}
/*
Enter your array size:
5
1
2
3
2
4
The Elements are:
1
2
3
2
4
*/