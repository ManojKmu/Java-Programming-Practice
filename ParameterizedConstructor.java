package com.example.training.oop;

// Constructor
 class Book {
    String name;    
    int id;
    int cost;

    public Book(String n, int i, int c) {
        name = n;
        id = i;
        cost = c;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Cost: " + cost);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Book b = new Book("Java", 234, 450);
        b.display();
    }
}
/* 
Name: Java
Id: 234
Cost: 450
  */