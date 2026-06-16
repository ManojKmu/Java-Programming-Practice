package com.example.training.oop;
class OutOfStockException extends Exception{
	public OutOfStockException (String msg)
	{
		super(msg);
	}
}
class Ecommerce{
	String name;
	int items;
	Ecommerce(String n,int i)
	{
		name=n;
		items=i;
	}
	public void stock(int stock) throws OutOfStockException
	{
		if(stock<items)
		{
			throw new OutOfStockException("Stock is not available");
		}  else {
			System.out.println("You have purchased your item");
		}
	}
}
public class UserDefinedExceptionExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Ecommerce e1=new Ecommerce("Manoj",7);
      try {
    	  e1.stock(5);
      } catch(Exception e)
      {
    	  System.out.println(e);
      }
	}

}
