package LinkedList;

//single linked list has one pointer i.e. next node only
//initially head is null
//without head sll cannot exist
class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class SIngleLinkedListInsertAtBegin {
     Node head=null;
     public void insertAtbegin(int newData)
     {
    	 //create new node
    	 Node newNode=new Node(newData);
    	 if(head==null)
    	 {
    		 head=newNode;
    	 } else {
    		 newNode.next=head;//link new node to old head
    		 head=newNode;//update head
    	 }
     }
    	 public void display()
    	 {
    		 if(head==null)
    		 {
    			 System.out.println("Empty list");
    		 }   else {
    			 Node temp=head;
    			 while(temp!=null)
    			 {
    				 System.out.println(temp.data);
    				 temp=temp.next;//move pointer to next node
    			 }
    		 }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SIngleLinkedListInsertAtBegin sll=new SIngleLinkedListInsertAtBegin();
		sll.insertAtbegin(10);
		sll.insertAtbegin(20);
		sll.insertAtbegin(30);
		sll.display();
	}

}
/*
30
20
10
*/