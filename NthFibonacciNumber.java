package com.example.recurssion;

import java.util.Scanner;

public class NthFibonacciNumber {
public static int fibonacci(int n)
{
	if(n==1||n==0) return n;
	/*Formula of fibonacci number
	 F(n)=F(n-1)+F(n-2)
	 */
	return fibonacci(n-1)+fibonacci(n-2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   int n=sc.nextInt();
   int temp=n;
   System.out.println("The given number "+temp+" fibonacci number is "+fibonacci(n));
	}

}
/*output
Enter a number
5
The given number 5 fibonacci number is 5
*/