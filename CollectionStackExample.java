package com.example.training.Collections;
import java.util.*;
public class CollectionStackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Stack<String> stack=new Stack<>();
   //1)push()
   stack.push("Orange");
   stack.push("Mango");
   stack.push("Grapes");
   stack.push("Dates");
   System.out.println(stack);//[Orange, Mango, Grapes, Dates]
   //2)pop()
   stack.pop();
   System.out.println(stack);//[Orange, Mango, Grapes]
   //2)pop()
   stack.pop();
   System.out.println(stack);//[Orange, Mango]
   stack.pop();
   stack.pop();
   //3)isEmpty() if no element there it returns false otherwise true
   System.out.println(stack.isEmpty());//true
   stack.push("Banana");
   stack.push("orange");
   stack.push("orange");
   //4)peek() return top most element in stack
   System.out.println(stack.peek());//orange
   //5)capacity()
   System.out.println(stack.capacity());//10
   //6)empty()
   System.out.println(stack.empty());//false
   //7)indexOf()
   System.out.println(stack.indexOf("cherry"));//-1(element not present in stack)
   System.out.println(stack.indexOf("orange"));//1
   //8(remove()
   System.out.println(stack.remove("orange"));
}

}
