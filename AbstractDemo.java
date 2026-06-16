package com.example.workshop;

    abstract class Car{
    	public void fuelTank() {
		System.out.println("Fill the fuel into the Tank");
		System.out.println("Drive the car");
	}
	
 public abstract void steering();
 public abstract void breaking();

}
  class Maruthi extends Car
{
	  public void steering()
	{
		System.out.println("Maruthi uses manual steering");
	}
	  public void breaking()
	{
		System.out.println("Maruthi uses gas Breaks");
		System.out.println("Apply breaks to stop the car");
	}
}
  class Santhro extends Car
{
	  public void steering()
	{
		System.out.println("Santhro uses manual steering");
	}
	 public void breaking()
	{
		System.out.println("Santhro uses Hydrallic Breaks");
		System.out.println("Apply breaks to stop the car");
	}
}
  public abstract class AbstractDemo {
	 public static void main(String args[])
	 {
		 Car m=new Maruthi();
		 m.fuelTank();
		 m.steering();
		 m.breaking();
		 
		 Santhro s=new Santhro();
		 s.fuelTank();
		 s.steering();
		 s.breaking();
	 }
 }