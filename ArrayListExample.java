package com.example.training.Collections;
//we take example of online shopping
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<String> product=new ArrayList<>();
   //1)add()
   product.add("Tv");
   product.add("Laptop");
   product.add("Mobile");
   product.add("Ac");
   //2)remove()
   product.remove("Tv");
   //print the output
   System.out.println(product);//[Laptop, Mobile, Ac]
   //3)size()
   System.out.println(product.size());//3
   //4)isEmpty()->it returns true if empty otherwise false
   System.out.println(product.isEmpty());//false
   for(int i=0;i<product.size();i++)
   {
  System.out.println(product.get(i));  //Laptop,Mobile,AC

   }
	}

}
