package com.example.training.Collections;

import java.util.*;

public class TreeSetExampleUsingIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> s=new TreeSet<>();
	       //1)add)()
		    s.add(10);
		    s.add(20);
		    s.add(30);
		    s.add(30);//this duplicate value ignored
		    s.add(40);
		    for(int ele:s)
		    {
		    	System.out.println(ele);
		    }
		    Iterator it=s.iterator();//iterator used for large dataset
		    while(it.hasNext())
		    {
		    	System.out.println(it.next());
		    }
		    
	}

}
/* for loop output
10
20
30
40
*/