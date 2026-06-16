package com.example.training.Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExampleUsingLoopReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> list=new LinkedList<>();
		   //1)add()
		   list.add(10);
		   list.add(20);
		   list.add(30);
		   list.add(40);
		   for(int i=list.size()-1;i>=0;i--)
		   {
			   System.out.println(list.get(i));//To print element we use the get() method
		   }
	}

}
/*
40
30
20
10
*/