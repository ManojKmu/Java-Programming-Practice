//In an array print the largest 2 numbers and smallest 2 numbers
import java.util.Arrays;
public class PrintLargerAndSmallerTwoElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {23,56,12,76,43,89};
     //step-1:sort the array,it will be in ascending order
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));//[12, 23, 43, 56, 76, 89]
      int len=arr.length;
      System.out.println("The Largest 2 numbers are:"+arr[len-1]+" "+arr[len-2]);
      System.out.println("The Smallest 2 numbers are:"+arr[0]+" "+arr[1]);
	}

}
/*
The Largest 2 numbers are:89 76
The Smallest 2 numbers are:12 23
*/