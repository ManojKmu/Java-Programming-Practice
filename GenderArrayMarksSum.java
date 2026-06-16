
package com.example.training1;
//Given two arrays of boy and girl based on that we need to add total marks
import java.util.Scanner;

public class GenderArrayMarksSum {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example: marks array where even indices = girls, odd indices = boys
        int[] marks = {14, 23, 31, 67, 32, 75};
        int sum = 0;

        System.out.print("Enter gender (g for girls, b for boys): ");
        char gender = sc.next().charAt(0);  // take first character of input

        if (gender == 'g') {
            for (int i = 0; i < marks.length; i += 2) { // even indices
                sum += marks[i];
            }
            System.out.println("The girls marks are: " + sum);
        } else if (gender == 'b') {
            for (int i = 1; i < marks.length; i += 2) { // odd indices
                sum += marks[i];
            }
            System.out.println("The boys marks are: " + sum);
        } else {
            System.out.println("Invalid input. Please enter 'g' or 'b'.");
        }
        sc.close();
    }
}

