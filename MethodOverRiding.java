package com.example.workshop;
class Parent
{
	public void cal(int x) 
	{
		System.out.println("The Square of a number is "+(x*x));
	}
}
class Child extends Parent
{
	public void cal(int x)
	{
		super.cal(x);
		System.out.println("The cube of a number is "+(x*x*x));
	}
}
public class MethodOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Child c=new Child();
      c.cal(3);
      
	}

}
