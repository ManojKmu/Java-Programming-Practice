package com.ecxample.training.recursion;
//we use parseInt built in method
public class ConvertBinaryNumberIntoDecimalNumberUsingParseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String binary="1011";
		        int decimal = Integer.parseInt(binary, 2); // base 2
		        System.out.println("Decimal value: " + decimal);
		    }

}
/*  
Decimal value: 11   */