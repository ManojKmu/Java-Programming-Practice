package LinkedList;

import java.util.Scanner;

class DoubleNode{
	int data;
	DoubleNode next;
	DoubleNode prev;
	DoubleNode(int data){
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
public class DoublyLinkedList2 {
	DoubleNode head=null;
	public void insertAtbegin(int newData) {
		DoubleNode newNode=new DoubleNode(newData);
		if(head==null) {
			head=newNode;
		} else {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
	}
	public void insertAtend(int newData) {
		DoubleNode newNode=new DoubleNode(newData);
		if(head==null) {
			head=newNode;
			return;
		}
		DoubleNode temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.prev=temp;
	}
	public void deleteAtbegin() {
		if(head==null) {
			System.out.println("List is empty cannot delete");
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
		head=head.next;
		head.prev=null;
	}
	public void deleteAtend() {
		if(head==null) {
			System.out.println("List is empty cannot delete");
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
	DoubleNode temp=head;
	while(temp.next!=null) {
		temp=temp.next;
	}
	temp.prev.next=null;
	}
public void displayForward() {
	if(head==null) {
		System.out.println("List is empty");
	} else {
		DoubleNode temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
}
public void displayBackward() {
	DoubleNode temp=head;
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
		DoublyLinkedList2 dll=new DoublyLinkedList2();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no.of nodes");
int node=sc.nextInt();
for(int i=0;i<node;i++) {
	int newNode=sc.nextInt();
	dll.insertAtbegin(newNode);
	dll.insertAtend(newNode);
}
dll.deleteAtbegin();
dll.deleteAtend();
System.out.println("The forward elements are:");
dll.displayForward();
System.out.println("The backward elements are:");
dll.displayBackward();
sc.close();
	}

}
/*
Enter the no.of nodes
4
100
200
300
400
The forward elements are:
300 
200 
100 
100 
200 
300 
The backward elements are:
300 
200 
100 
100 
200 
300 

*/
