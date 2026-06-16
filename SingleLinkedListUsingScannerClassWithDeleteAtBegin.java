package LinkedList;
//For a single linked list we delete at beginning
import java.util.*;
class Node6{
	int data;
	Node6 next;
	Node6(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class SingleLinkedListUsingScannerClassWithDeleteAtBegin {
   Node6 head=null;
   public  void InsertAtBegin(int newData)
   {
	   Node6 newNode=new Node6(newData);
	   if(head==null) {
		   head=newNode;
	   } else {
		   newNode.next=head;
		   head=newNode;
	   }
   }
   public void display()
   {
	   if(head==null) {
		   System.out.println("List is empty");
	   } else {
		   Node6 temp=head;
		   while(temp!=null)
		   {
			   System.out.println(temp.data);
			   temp=temp.next;
		   }
	   }
   }
   public void deleteAtBegin() {
	   if(head==null) {
		   System.out.println("List is empty cannot delete");
		   return;
	   }
	   head=head.next;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedListUsingScannerClassWithDeleteAtBegin sll=new SingleLinkedListUsingScannerClassWithDeleteAtBegin();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no.of nodes:");
	int node=sc.nextInt();
	for(int i=0;i<node;i++) {
		int newNode=sc.nextInt();
		sll.InsertAtBegin(newNode);
	}
		sll.deleteAtBegin();
		System.out.println("The elements are:");
		sll.display();
		sc.close();
	}

}
/*
Enter the no.of nodes:
4
100
200
300
400
The elements are:
300
200
100
*/