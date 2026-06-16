package DataStructures;
//For a given stack we need to return true when it is balanced  otherwise return false  for a given   String s="{([])}"
import java.util.*;
public class StackBalancedInterviewQuestion {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Stack<Character> stack=new Stack<>();
   String s="{([])}";
   char[] ch=s.toCharArray();
   for(char c:ch )
   {
   if(c=='{')
   {
      stack.push('{');
   }
   else if(c=='(')
   {
      stack.push('(');
   }
   else if(c=='[')
   {
      stack.push('[');
   }
   else if(c=='}')
   {
      if(stack.peek().equals('{'))
      {
         stack.pop();
      }
      else
      {
         System.out.println("Not Balanced");
         return;
      }
   }
   else if(c==')')
   {
      if(stack.peek().equals('('))
      {
         stack.pop();
      }
      else
      {
         System.out.println("Not Balanced");
         return;
      }
   }
   else if(c==']')
   {
      if(stack.peek().equals('['))
      {
         stack.pop();
      }
      else
      {
         System.out.println("Not Balanced");
         return;
      }
   }
	}
    if(stack.isEmpty())
    {
    	System.out.println("Balanced");
    }  else {
    	System.out.println("Not Balanced");
    }
	}

}
