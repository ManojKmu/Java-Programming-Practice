//program to print the largest 2 numbers and n smallest numbers using array

import java.util.Arrays;

public class PrintLargerTwoAndSmallerNElementsInArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr= {23,56,12,76,43,89};
		  int len=arr.length;
		   //step-1:sort the array,it will be in ascending order
		    Arrays.sort(arr);
		  System.out.println(Arrays.toString(arr));//[12, 23, 43, 56, 76, 89]
		  //print the largest two number
		  System.out.print("Largest two number are:");
		  System.out.println(arr[len-1]+" "+arr[len-2]);
		  //print smallest n numbers based on choice
		  int num=3;
		  System.out.print("Smallest "+num+" numbers are:");
		  for(int i=0;i<num;i++) {
			  System.out.print(arr[i]+" ");
		  }
	}

}
