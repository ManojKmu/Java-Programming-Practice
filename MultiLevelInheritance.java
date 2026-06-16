package com.example.training.oop;
class A{
	 void display()
	 {
		 System.out.println("A class");
	 }
}
class B extends A{
	void display()
	{
		super.display();
		System.out.println("B class");
	}
}
class C extends B{
	void display()
	{
		super.display();
		System.out.println("C class");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   C c=new C();
   c.display();
	}

}
