package com.example.training.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExampleUsingScannerWithForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product name to add in cart");
		String newItem=sc.next();
		List<String> product=new ArrayList<>();
		product.add("Tv");
		product.add("Laptop");
		product.add("Mobile");
		boolean exists = false;
		for (int i = 0; i < product.size(); i++) {
		    if (product.get(i).equals(newItem)) {
		        exists = true;
		        break;
		    }
		}
		if (exists) {
		    System.out.println("The product already exists cannot add");
		} else {
		    product.add(newItem);
		    System.out.println("The new item is inserted in the cart");
		    System.out.println(product);
		}
		sc.close();
	}

}
/*Run-1
 Enter the product name to add in cart
Tv
The product already exists cannot add      */
/* Run-2
 Enter the product name to add in cart
Mobile
The product already exists cannot add
 */
