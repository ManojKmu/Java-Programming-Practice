package com.example.training.oop;
interface Animal2{
	int legs=4;
	public abstract void eat();
	public void sound();
	//Interfaces can support the complete or non-abstract methods after java 8 version
	default void sleep()
	{
		System.out.println("Sleep");
	}
}
class Cat2 implements Animal2{
	public void eat()
	{
		System.out.println("Fish is eaten by cat");
	}
	public void sound()
	{
		System.out.println("Meow Meow");
	}
}
class Lion implements Animal2{
	public void eat()
	{
		System.out.println("Deer is eaten by lion");
	}
	public void sound()
	{
		System.out.println("Roar");
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Lion l=new Lion();
    l.eat();
    l.sound();
    System.out.println("The lion has"+l.legs+" legs");
     l.sleep();//TO call sleep using lion object the method should be declared as default
    Cat2 c=new Cat2();
    c.eat();
    c.sound();
    System.out.println("The cat has "+l.legs+" legs");
	}

}
/*
Deer is eaten by lion
Roar
Fish is eaten by cat
Meow Meow
*/