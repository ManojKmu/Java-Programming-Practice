package com.example.recurssion;

public class FunctionCallingItself2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   print(5);
	}
	public static void  print(int n)
	{
		if(n==0) return;
		System.out.println(n);
		print(n-1);
	}

}
/*output 
5
4
3
2
1

*/