package com.example.training2.onedimensionalarrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {7,4,1,3,5,2};
      //Step-1:Find max element from array
     int max=Integer.MIN_VALUE;//int max=arr[0];
     for(int i=0;i<arr.length;i++)
     {
    	 if(arr[i]>max)
    	 {
    		 max=arr[i];
    	 }
     }
     //Step-2:Apply sum of n natural number formaula
     int expectedSum=max*(max+1)/2;
     //step-3:Sum of all array elements
     int actualSum=0;
     for(int num:arr)
     {
    	 actualSum+=num;
     }
     // Step-4: Missing element = expectedSum - actualSum
     int missingElement = expectedSum - actualSum;

     System.out.println("The missing element is: " + missingElement);
 }
}
/*   The missing element is: 6  */
//54,93,12,65   //9 12  3 11