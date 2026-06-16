package com.example.workshop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BufferedReaderExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter a number:");
int a=Integer.parseInt(br.readLine());
System.out.println("Enter another number:");
int b=Integer.parseInt(br.readLine());
int c=a+b;
System.out.println("Sum is "+c);
	}

}
