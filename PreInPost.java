package com.example.recurssion;

public class PreInPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   pip(2);
	}
  public static void pip(int n)
  {
	  if(n==0) return ;
	  System.out.print(n+" ");
	  pip(n-1);
	System.out.print(n+" ");
	    pip(n-1);
	    System.out.print(n+" ");
  }
}
/*output
2 1 1 1 2 1 1 1 2 
*/