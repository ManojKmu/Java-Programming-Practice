 package hackerRankproblems;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionInterviewQuestion {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    try {
    	System.out.println("Enter a value");
    	int x=sc.nextInt();
    	int y=sc.nextInt();
    	System.out.println(x/y);
    }catch(InputMismatchException e) {
    	System.out.println(e.getClass().getName());
    }catch(ArithmeticException e) {
    	System.out.println(e);
    }
    sc.close();
	}

}
/*Run-1
Enter a value
10
Hello
java.util.InputMismatchException
*/
/*Run-2
Enter a value
10
0
java.lang.ArithmeticException: / by zero
*/
/*Run-3
Enter a value
10
3
3
*/