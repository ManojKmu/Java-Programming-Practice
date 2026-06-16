package LinkedList;

import java.util.Scanner;

class DNode{
	int data;
	DNode next;
	DNode prev;
	DNode(int data){
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
public class DoublyLinkedList {
	DNode head=null;
public  void insertAtbegin(int newData) {
	DNode newNode=new DNode(newData);
	if(head==null) {
		head=newNode;
	} else {
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
	}
}
public void displayForward() {
	if(head==null) {
		System.out.println("List is empty");
	} else {
		DNode temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
}
public void displayBackward() {
	DNode temp=head;
	while(temp.next!=null) {
		temp=temp.next;
	}
	while(temp!=null) {
		System.out.println(temp.data+" ");
		temp=temp.prev;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll=new DoublyLinkedList();
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the no.of nodes:");
   int node=sc.nextInt();
   for(int i=0;i<node;i++) {
	   int newNode=sc.nextInt();
	   dll.insertAtbegin(newNode);
   }
   System.out.println("The forward elements are:");
   dll.displayForward();
   System.out.println("The backward elements are:");
   dll.displayBackward();
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
The forward elements are:
400 
300 
200 
100 
The backward elements are:
100 
200 
300 
400 
*/