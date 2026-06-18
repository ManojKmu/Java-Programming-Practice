package hackerRankproblems;
	import java.util.Scanner;
	import java.util.regex.*; //regex->regular expression
	public class PatternSyntaxChecker {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int testCases = Integer.parseInt(in.nextLine());

	        while (testCases > 0) {
	            String pattern = in.nextLine();
	            try {
	                Pattern.compile(pattern); // attempt to compile regex
	                System.out.println("Valid");
	            } catch (PatternSyntaxException e) {
	                System.out.println("Invalid");
	            }
	            testCases--;
	        }
	        in.close();
	    }
	}

/*
 Problem stmt:
For the Pattern Syntax Checker problem, the idea is simple:
You’re given several regex patterns as input. For each one, you must check if it’s a valid regex. In Java, that means:
Try to compile the pattern using Pattern.compile(pattern).
If it compiles successfully → print Valid.
If it throws a PatternSyntaxException → print Invalid.
*/
/*Sample Input

3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat
*/
/*
Sample Output

Valid
Invalid
Invalid
*/