package com.example.strings;

public class PassingStringMethod {
public static void change(int x)
{
	x=20;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int   x=10;
          change(x);
          System.out.println(x+" ");//Output is 10
	}

}
