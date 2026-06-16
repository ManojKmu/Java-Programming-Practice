package com.example.training.oop;
//User defined exception by our own
class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg)
	{
		super(msg);
	}
}
class Person{
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void vote(int age) throws InvalidAgeException
	{
		if(age>18)
		{
			System.out.println(this.name+ " Eligible for vote");
		} else {
			throw new  InvalidAgeException("You have less age not eligible for vote");
		}
	}
}
public class UserDefinedExceptionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Person p=new Person("Manoj",18);
         try {
         p.vote(19);
         }catch(Exception e)
         {
        	 System.out.println(e);
         }
	}

}
