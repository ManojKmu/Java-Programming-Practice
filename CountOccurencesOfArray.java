package com.example.training.Collections;
import java.util.*;
public class CountOccurencesOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,1,4,5,6,4};
		Map<Integer,Integer> map=new HashMap<>();
		for(int ele:arr)
		{
			if(map.containsKey(ele))
			{
				map.put(ele,map.get(ele)+1);
			} else {
				map.put(ele, 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" occur "+entry.getValue()+" times");
		}
	}

}
/*
1 occur 2 times
2 occur 1 times
3 occur 1 times
4 occur 2 times
5 occur 1 times
6 occur 1 times
*/