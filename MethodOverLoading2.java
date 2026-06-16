package com.example.workshop;


class Addition1 {
 public  static void sum(int a,int b)
  {
	   System.out.println("Sum of two ints: "+(a+b));
  }
  public  static void sum(int a,int b,int c)
  {
	   System.out.println("Sum of 3 ints: "+(a+b+c));
  }
  public static void sum(float x,float y)
  {
	   System.out.println("Sum of 2 floats: "+(x+y));
  }
}
 public class MethodOverLoading2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
      Addition1.sum(10,20);
      Addition1.sum(10.5f,20.5f);
      Addition1.sum(10,20,30);
	}

}
