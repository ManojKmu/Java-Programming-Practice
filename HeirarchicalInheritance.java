package com.example.workshop;

public class HeirarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Cat c=new Cat();
       System.out.println("The cat is created");
       c.shout();
       c.color("Black");
       
       Dog d=new Dog();
       System.out.println("the dog is created");
       d.bark();
       d.color("White");
	}

}
