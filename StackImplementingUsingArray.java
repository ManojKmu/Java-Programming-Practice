package DataStructures;
//stack(linear ds) can be implemented in 2 ways 1)Array 2)Linkedlist
//1)Using Array concept
public class StackImplementingUsingArray {
   int top=-1;//Initially stack is empty means -1
   int size;
   int[] arr;
   StackImplementingUsingArray(int size)
   {
	   this.size=size; 
	   this.arr=new int[5];
	}
   public void push(int data)
   {
	   if(top==size-1)
	   {
		   System.out.println("Stack is overflow");
	   }   else {
		   arr[++top]=data;
	   }
   }
   public void pop()
   {
	   if(top==-1)
	   {
		   System.out.println("Stack is underflow");
	   }  else {
		   top--;
	   }
   }
   public void display()
   {
	   if(top==-1)
	   {
		   System.out.println("Stack is empty");
	   }
	   else {
	   for(int i=top;i>=0;i--)
	   {
		   System.out.println(arr[i]);
	   }
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImplementingUsingArray s=new StackImplementingUsingArray(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.pop();
		s.display();
	}

}
/*
40
30
20
10
*/