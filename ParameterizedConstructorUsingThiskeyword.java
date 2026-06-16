package com.example.training.oop;
//this keyword is used when the local and instance variables are same ,in order to access the instance variable
//Constructor
class BookExample {
 String name;    
 int id;
 int cost;

 public BookExample(String name, int id, int cost) {
     this.name = name;
     this.id = id;
     this.cost = cost;
 }

 public void display() {
     System.out.println("Name: " +this.name);
     System.out.println("Id: " + this.id);
     System.out.println("Cost: " +this.cost);
 }
}

public class ParameterizedConstructorUsingThiskeyword {
 public static void main(String[] args) {
     BookExample b = new BookExample("Java", 234, 450);
     b.display();
 }
}
/* 
Name: Java
Id: 234
Cost: 450
*/


