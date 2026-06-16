package DataStructures;
//In this  array   {5,7,19,24} we need to sort that and return the result as{7,19,24,-1} because 7 is greater than 5 and 19 is greater than 7 and 24 is greater than 19 and there is no element greater than 24 so we return -1
import java.util.*;
public class StackUsingArrayInterviewQuestion {
public static int[] nextGreaterElement(int[] arr) {
	int n = arr.length;
	int[] result = new int[n];
	Stack<Integer> stack = new Stack<>();

	for (int i = n - 1; i >= 0; i--) {
		while (!stack.isEmpty() && stack.peek() <= arr[i]) {
			stack.pop();
		}
		result[i] = stack.isEmpty() ? -1 : stack.peek();
		stack.push(arr[i]);
	}

	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {5,7,19,24};
        int[] result=nextGreaterElement(arr);
		System.out.println(Arrays.toString(result));
	}

}
/*
[7, 19, 24, -1]
 */