package com.example.training.oop;
class Animal{
	 void display()
	 {
		 System.out.println("parent class");
	 }
}
class Cat extends Animal{
	void display()
	{
		super.display();
		System.out.println("child class");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     B b=new B();
     b.display();
	}

}

