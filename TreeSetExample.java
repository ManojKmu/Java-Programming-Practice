package com.example.training.Collections;
//treeset is ordered and don't allow duplicate values
import java.util.*;
public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TreeSet<Integer> s=new TreeSet<>();
       //1)add)()
	    s.add(10);
	    s.add(20);
	    s.add(30);
	    s.add(30);//this duplicate value ignored
	    s.add(40);
	    System.out.println(s); //[10, 20, 30, 40]
        //2)isEmpty()
	    System.out.println(s.isEmpty());//false
	    //3)remove()
	    System.out.println(s.remove(20));
	     //print the element after removing
	    System.out.println(s);//[10, 30, 40]
	    //4)size()
	    System.out.println(s.size());//3
	    //5)contains
	    System.out.println(s.contains(10));//true
	}

}
