package com.ecxample.training.recursion;
//1011 we need to convert binary to decimal using 8421 code then answer is 11
public class ConvertBinaryNumberIntoDecimalNumber {
     public static int binaryTwoDecimal(String binary)
     {
    	int power=0,decimal=0;
    	for(int i=binary.length()-1;i>=0;i--)
    	{
    		char bit=binary.charAt(i);
    		if(bit=='1')
    		{
    			decimal+=Math.pow(2, power);
    		}
    		power++;
    	}
    	return decimal;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String binary="1011";
      System.out.println("The decimal number is:"+binaryTwoDecimal(binary));
	}
}
/*  The decimal number is:11
*/
