package com.example.training.oop;
//To create a user defined exception
class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String msg)
	{
		super(msg);
	}
}
class BankExample{
	String name;
	int initialbal;
	public BankExample(String name,int initialbal)
	{
		this.name=name;
		this.initialbal=initialbal;
	}
	public void withdraw(int amount) throws InsufficientFundsException
	{
		if(amount>initialbal) 
		{
			throw new  InsufficientFundsException("not having enough balance");
		} 
			System.out.println("Withdraw success");
			initialbal-=amount;
			System.out.println("balance is:"+initialbal);
	}
}
//user defined or custom exception  in interview imp
public class UserDefinedExceptionExample {
	public static void main(String[] args) 
    {
		// TODO Auto-generated method stub
      BankExample b=new BankExample("Manoj",5000);
     try {
    	 b.withdraw(7000);
     } catch(InsufficientFundsException isfe)
     {
    	 System.out.println(isfe);
     }  finally {
    	 System.out.println("Thank you for visiting our atm");
     }
	}

}
