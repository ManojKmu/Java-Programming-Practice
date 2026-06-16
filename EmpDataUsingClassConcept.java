package com.example.training.oop;
class Employee{
	static String name="Manoj";
	String role="Debug";
	   public static void display()
	   {
		   System.out.println("Name:"+name);
	   }
}
public class EmpDataUsingClassConcept {
         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee e=new Employee();
    e.display();
	}

}
