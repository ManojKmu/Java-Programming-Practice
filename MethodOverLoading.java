package com.example.workshop;

 class Addition {
   public void sum(int a,int b)
   {
	   System.out.println("Sum of two ints: "+(a+b));
   }
   public void sum(int a,int b,int c)
   {
	   System.out.println("Sum of 3 ints: "+(a+b+c));
   }
   public void  sum(float x,float y)
   {
	   System.out.println("Sum of 2 floats: "+(x+y));
   }
}
  public class MethodOverLoading{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Addition a=new Addition();
       a.sum(10,20);
       a.sum(10.5f,20.5f);
       a.sum(10,20,30);
	}

}
