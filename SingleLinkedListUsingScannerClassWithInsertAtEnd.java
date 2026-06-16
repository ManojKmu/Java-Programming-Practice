package LinkedList;
import java.util.*;
class Node2{
	int data;
	Node2 next;
	Node2(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class SingleLinkedListUsingScannerClassWithInsertAtEnd {
    Node2 head=null;
    public void insertAtbegin(int newData)
    {
    	Node2 newNode=new Node2(newData);
    	if(head==null)
    	{
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
    		System.out.println("Empty list");
    	}  else {
    		Node2 temp=head;
    		while(temp!=null)
    		{
    			System.out.println(temp.data);
    			temp=temp.next;
    		}
    	}
    }
    public void insertAtEnd(int newData) {
        Node2 newNode = new Node2(newData);
        if (head == null) {
            head = newNode;
        } else {
            Node2 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SingleLinkedListUsingScannerClassWithInsertAtEnd list=new  SingleLinkedListUsingScannerClassWithInsertAtEnd();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of nodes:");
     int node=sc.nextInt();
     for(int i=0;i<node;i++)
     {
    	 int newNode=sc.nextInt();
    	 list.insertAtbegin(newNode);
    	 list.insertAtEnd(newNode);
     }
     System.out.println("Linked list elements are:");
     list.display();
     sc.close();
	}

}
/*
Enter the no.of nodes:
3
100
200
300
Linked list elements are:
300
200
100
100
200
300
*/