package DataStructures;
import java.util.*;
public class StackBalancedInterviewQuestion2 {
  public static boolean isBalanced(String s)
  {
	  Stack<Character> stack=new Stack<>();
	   char[] ch=s.toCharArray();
	   for(char c:ch)
	   {
		   //push logic
		   if(c=='{'||c=='('||c=='[')
		   {
			   stack.push(c);
		   }
		   //pop logic
		   else {
			   if(stack.isEmpty())
			   {
				   return false;
			   } else {
				   char top=stack.pop();
				   if(top=='[' && c!=']'||top=='{' && c!='}'||top=='(' && c!=')')
				   {
					   return false;
				   } 
			   }
		   }
	   }
	   if(stack.isEmpty())
	   {
		   return true;
	   } else {
		   return false;
	   }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="{([])}";
		System.out.println(isBalanced(s));
	}

}
