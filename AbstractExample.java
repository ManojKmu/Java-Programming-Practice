package com.example.training.oop;
abstract class Bank
{
	//abstract method  or incomplete methods
	abstract void loan(float perc);
	//non-abstract method  or complete or concrete method
	public void netBanking()
	{
		System.out.println("Online payment is available");
	}
}
class SBI extends Bank
{
	public void loan(float perc)
	{
		System.out.println("SBI gives loan on "+perc+" ROI");
	}
}
class HDFC extends Bank
{
	public void loan(float perc)
	{
		System.out.println("HDFC gives loan on "+perc+" ROI");
	}
}
public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  SBI s=new SBI();
	      s.loan(34.6f);
	      s.netBanking();
         HDFC h=new HDFC();
         h.loan(45.6f);
         h.netBanking();
       
	}

}
/*
SBI gives loan on 34.6 ROI
Online payment is available
HDFC gives loan on 45.6 ROI
Online payment is available
*/