package com.example.recurssion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       hanoi(3,'A','B','C');
	}

	private static void hanoi(int n, char a, char b, char c) {
		// TODO Auto-generated method stub
		   if(n==0) return;
		   //n-1 disks from A to B via c
		   hanoi(n-1,a,c,b);
		   //largest from A to C
		   System.out.println(a+"->"+c);
		   //n-1 disks from B to C via A
		   hanoi(n-1,b,a,c);
	}

}
