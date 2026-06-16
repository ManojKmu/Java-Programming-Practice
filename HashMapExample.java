package com.example.training.Collections;
//we took the example of menu items in a hotel
import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Map<String,Integer> map=new HashMap<>();
    //1)put()->TO insert the values in hashmap
    map.put("Biryani", 450);
    map.put("Mutton", 500);
    map.put("Fish Fry", 650);
    map.put("Roasted Fish", 650);
    System.out.println(map);//{Fish Fry=650, Biryani=450, Mutton=500, Roasted Fish=650}
    //2)containsKey()
    System.out.println( map.containsKey("Mutton"));//true
    //3)isEmpty()
    System.out.println(map.isEmpty());//false
	}

}
