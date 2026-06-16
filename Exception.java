package com.example.workshop;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a,b;

  try {
	  a=Integer.parseInt(args[0]);
	  b=Integer.parseInt(args[1]);
	  int c=a/b;
	  System.out.println("The sum is "+c);
  } 
  //We can use one stmt instead of writing multiple catch blocks
  /*
   catch(Exception e)//Exception is the root class of all exceptions 
   {
   Sysout(e);
   }
   */
  catch(ArithmeticException ae) { // it arise when 10/0
  System.out.println(ae);//ae.printSatckTrace()
	}
  catch(NumberFormatException nfe)
  {
	  System.out.println(nfe);//It occurs when given as 10 Manoj
  }
  catch(ArrayIndexOutOfBoundsException ai)
  {
	  System.out.println(ai);//It is used passed args only one for two variables
  }
  System.out.println("End of the program");
	}
}
