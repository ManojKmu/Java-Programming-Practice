package com.example.recurssion;

public class GlobalVariables2 {
   static int x=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     fun();
     System.out.println(x);//20
      int x=9;
      System.out.println(x);//9
      x=4;
      System.out.println(x);//4
	}
public static void fun()
{
	int x=10;
}
}
