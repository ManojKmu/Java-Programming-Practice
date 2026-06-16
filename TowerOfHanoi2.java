package com.ecxample.training.recursion;

public class TowerOfHanoi2 {
	 public static void hanoi(int n,char a,char b,char c)
	  {
		  //base case
		  if(n==0) return ;
		  //n-1 From A to B via C
		  hanoi(n-1,a,c,b);
		  //Move largest disk from A to C
		  System.out.println("Disk "+n+ " tranfer from:"+a+"->"+c);//a->source,c->destination,b->auxiliary
		  //n-1 From B to C via A
		  hanoi(n-1,b,a,c);
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   hanoi(3,'A','B','C');
	}

}
