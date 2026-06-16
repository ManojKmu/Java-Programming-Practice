package com.example.training1;
import java.util.*;
//In the given array we seperate the odd and even elements
public class EvenAndOddElementsSeperatingArray {
	public static void main(String args[]) {
   int[] arr= {4,13,7,18,22,39,89,56};
   List<Integer> even_list=new ArrayList<>();
   List<Integer> odd_list=new ArrayList<>();
   for(var ele:arr)
   {
	   if(ele %2==0)
	   {
		   even_list.add(ele);
	   }  else {
		   odd_list.add(ele);
	   }
   }
   System.out.println("The even numbers are:"+even_list);
   System.out.println("The odd numbers are:"+odd_list);
   
	}
}
/*  The even numbers are:[4, 18, 22, 56]
The odd numbers are:[13, 7, 39, 89]
*/