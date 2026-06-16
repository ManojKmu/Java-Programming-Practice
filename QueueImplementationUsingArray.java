package DataStructures;

public class QueueImplementationUsingArray {
    int rear=-1;
	int front=-1;
    int size;
	int[] arr;
	public QueueImplementationUsingArray(int size) {
        this.size=size;
		this.arr=new int[size];
	}
	public void enqueue(int data) {
		if(rear==size-1) {
			System.out.println("Queue is full");
		}
		else {
			rear++;
			arr[rear]=data;
		}
	}
	public void dequeue() {
		if(front==rear) {
			System.out.println("Queue is empty");
		}
		else {
			front++;
			System.out.println(arr[front]);
		}
	}
	public void display() {
		if(front==rear) {
			System.out.println("Queue is empty");
		}
		else {
			for(int i=front+1;i<=rear;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  	  QueueImplementationUsingArray queue=new QueueImplementationUsingArray(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.display();
		queue.dequeue();
		queue.dequeue();
		queue.display();
	}

}
