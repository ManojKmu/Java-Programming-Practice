package LinkedList;
import java.util.*;
class Node3{
	int data;
	Node3 next;
	Node3(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class SingleLinkedListUsingScannerClass {
     Node3 head=null;
     //define the method
     public void insertAtbegin(int newData)
     {
     Node3 newNode=new Node3(newData);//create a new node
     if(head==null) {
    	 head=newNode;
     }  else {
    	 newNode.next=head;
    	 head=newNode;
     }
     }
      public void display()
       {
      if(head==null)
      {
    	  System.out.println("Empty linked list");
      }  else {
    	  Node3 temp=head;
    	  while(temp!=null)
    	  {
    		  System.out.println(temp.data);
    		  temp=temp.next;
    	  }
    	  
      }
 }
      public void insertAtend(int newData) {
    	  Node3 newNode=new Node3(newData);
    	  if(head==null) {
    		  head=newNode;
    	  } else {
    		  Node3 temp=head;
    		  while(temp.next!=null) {
    			  temp=temp.next;
    		  }
    		  temp.next=newNode;
    	  }
      }
      public void deleteAtbegin() {
    	  if(head==null) {
    		  System.out.println("List is empty cannot delete");
    	  }
    	  head=head.next;
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
    	  Node3 temp=head;
    	  while(temp.next.next!=null) {
    		  temp=temp.next;
    	  }
    	  temp.next=null;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedListUsingScannerClass  list=new SingleLinkedListUsingScannerClass();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no.of nodes:");
    int node=sc.nextInt();
    for(int i=0;i<node;i++)
    {
    	int newData=sc.nextInt();
    	list.insertAtbegin(newData); // FIXED 	
    	list.insertAtend(newData);
    }
    list.deleteAtbegin();
    list.deleteAtend();
    System.out.println("Elements are:");
    list.display();
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
Elements are:
300
200
100
100
200
300
*/