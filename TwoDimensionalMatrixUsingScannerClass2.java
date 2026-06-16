package com.example.training2.twodimensionalarrays;
import java.util.*;
public class TwoDimensionalMatrixUsingScannerClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);

		        // Read dimensions
		        System.out.print("Enter number of rows: ");
		        int rows = sc.nextInt();
		        System.out.print("Enter number of cols: ");
		        int cols = sc.nextInt();

		        int[][] mat1 = new int[rows][cols];
		        int[][] mat2 = new int[rows][cols];
		        int[][] res = new int[rows][cols];

		        // Input first matrix in matrix form
		        System.out.println("Enter elements of first matrix (" + rows + "x" + cols + "):");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                mat1[i][j] = sc.nextInt();
		            }
		        }

		        // Input second matrix in matrix form
		        System.out.println("Enter elements of second matrix (" + rows + "x" + cols + "):");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                mat2[i][j] = sc.nextInt();
		            }
		        }

		        // Perform addition
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                res[i][j] = mat1[i][j] + mat2[i][j];
		            }
		        }

		        // Print result in matrix form
		        System.out.println("Resultant Matrix after Addition:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print(res[i][j] + " ");
		            }
		            System.out.println();
		        }

		        sc.close();
		    }
		}

/*
Enter number of rows: 2
Enter number of cols: 2
Enter elements of first matrix (2x2):
1 2
3 4
Enter elements of second matrix (2x2):
1 2 
3 4
Resultant Matrix after Addition:
2 4 
6 8     
*/