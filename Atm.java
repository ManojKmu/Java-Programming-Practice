package com.example.training.oop;
class ATMDetails
{
	String card_type="debit";
	private static int pin=769;
	int card_no=123456;
	int amount=4500;
	public void setPin(int newPin)
	{
		this.pin=newPin;
		System.out.println("Pin changes successfully");
	}
	public int getPin() {
		return this.pin;
	}
}
public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMDetails sbi=new ATMDetails();
		System.out.println(sbi.getPin());//769
		sbi.setPin(8340);
		System.out.println(sbi.getPin());
        System.out.println(sbi.amount);
	}

}
