package com.example.workshop;
abstract class Office
{
	public void branch(String name)
	{
		System.out.println("The Branch is: "+name);
	}
	public abstract void role();
}
class Employee extends Office{
	public void role()
	{
		System.out.println("Role is developer");
	}
}
class Employee2 extends Office{
	public void role()
	{
		System.out.println("Role is tester");
	}
}
public class AbstractEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee e1=new Employee();
      e1.branch("Rangapuram");
      e1.role();
      Employee2 e2=new Employee2();
      e2.branch("hyd");
      e2.role();
	}

}
