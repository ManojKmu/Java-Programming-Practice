package com.example.training.Collections;
//Iterating with For-Each loop
import java.util.LinkedList;
import java.util.List;

public class LinkedListExampleUsingLoop {
	public static void main(String[] args) {
		 // TODO Auto-generated method stub
   List<Integer> list=new LinkedList<>();
   //1)add()
   list.add(10);
   list.add(20);
   list.add(30);
   list.add(40);
   for(int i=0;i<list.size();i++)
   {
	   System.out.println(list.get(i));//To print element we use the get() method
   }
}
}
/*
10
20
30
40
*/