package com.example.training2.onedimensionalarrays;
//Given array we need to find second mininmum element
public class ArraySecondMinimumElement {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 13, 45};
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int ele : arr) {
            if (ele < firstMin) {
                secondMin = firstMin;  // shift down
                firstMin = ele;
            } else if (ele < secondMin && ele > firstMin) {
                secondMin = ele;
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No second minimum element found.");
        } else {
            System.out.println("The second minimum element is: " + secondMin);
        }
    }
}
/*

The second minimum element is: 13
*/