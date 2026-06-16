package com.example.training.Collections;
//Linked list can be added in 3 ways such as:end,begin and particular position

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
    List<Integer> list=new LinkedList<>();
    //1)add()
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(2,80);//At index 2 position we add 80
    System.out.println(list);//[10, 20, 80, 30, 40]
    //2)addFirst()
    list.addFirst(90);
    System.out.println(list);//[90, 10, 20, 80, 30, 40]
    //3)addLast()
    list.addLast(70);
    System.out.println(list);//[90, 10, 20, 80, 30, 40, 70]
    //4)remove() ->remove a particular element at a index position
    list.remove(2);
    System.out.println(list);//[90, 10, 80, 30, 40, 70]
    //5)removeFirst()
    list.removeFirst();
    System.out.println(list);//[10, 80, 30, 40, 70]
     //6)removeLast()
    list.removeLast();
    System.out.println(list);//[10, 80, 30, 40] 
    //7)removeAll()->remove all elements from linked list
    list.removeAll(list);
    System.out.println(list);//[]
    //8)clear()
    list.clear();
    System.out.println(list);//[]
    }

}
