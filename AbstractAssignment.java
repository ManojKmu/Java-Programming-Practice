package com.example.workshop;
abstract class Order
{
	public void bookProduct()
	{
		System.out.println("This is  your order");
	}
	public abstract void payment();
}
class PhonePay extends Order
{
	public void payment()
	{
		System.out.println("You paid the amount using phone pay");
	}
}
class GooglePay extends Order
{
	public void payment()
	{
		System.out.println("You paid the amount using google pay");
	}
}
public class AbstractAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PhonePay p=new PhonePay();
     p.bookProduct();
     p.payment();
     GooglePay gp=new GooglePay();
     gp.bookProduct();
     gp.payment();
	}

}
