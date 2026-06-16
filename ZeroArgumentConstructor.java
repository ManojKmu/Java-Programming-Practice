package com.example.training.oop;
 class Student{
	 String name;
	 int id;
	 String branch;
	 Student()
	 {
		 name="Manoj";
		 id=234;
		 branch="cse";
	 }
	 public void display()
	 {
		 System.out.println("Name:"+name);
		 System.out.println("id:"+id);
		 System.out.println("Branch:"+branch);
	 }
 }
public class ZeroArgumentConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Student s=new Student();
   s.display();
	}

}
/*
Name:Manoj
id:234
Branch:cse
*/