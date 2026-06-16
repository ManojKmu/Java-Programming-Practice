package com.example.training.Collections;
//set don't have duplicates and it is unordered
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Set<Integer> s=new HashSet<>();
    //1)add)()
    s.add(10);
    s.add(20);
    s.add(30);
    s.add(30);//this duplicate value ignored
    s.add(40);
    System.out.println(s);//[20, 40, 10, 30]
    //2)isEmpty()
    System.out.println(s.isEmpty());//false
    //3)contains()
    System.out.println(s.contains(10));//true
    //4)remove()->For remove we need to specify the object nmae or value
    System.out.println(s.remove(30));//true
    //print the after removing
    System.out.println(s);
	}

}
