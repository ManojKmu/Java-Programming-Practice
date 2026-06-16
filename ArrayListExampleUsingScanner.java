package com.example.training.Collections;
//we take the scanner class if item exist can't add otherwise add it in list
import java.util.*;
public class ArrayListExampleUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the product name to add in cart");
String newItem=sc.next();
List<String> product=new ArrayList<>();
product.add("Tv");
product.add("Laptop");
product.add("Mobile");
if(product.contains(newItem))//contains time complexity is O(n)
	
{
	System.out.println("The product already exists cannot add");
} else {
	product.add(newItem);
	System.out.println("The new item is inserted in the cart");
	System.out.println(product);
}
sc.close();
}

}
/*
Enter the product name to add in cart
Machine
The new item is inserted in the cart
[Tv, Laptop, Mobile, Machine]
*/
/*
Enter the product name to add in cart
Tv
The product already exists cannot add
*/