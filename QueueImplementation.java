package com.Bridgelabz.StackandQueue;

public class QueueImplementation {
	Node front;
	Node rear;

//Method for creation of queue
	public void enqueue(int data) {
		Node node = new Node();
		node.data = data;
		if (front == null) {
			front = node;
			rear = node;
		} else {
			rear.next = node;
			rear = node;
		}
	}

//Method for displaying elements of queue
	public void display() {
		if (front == null)
			System.out.println("Queue is Empty");
		else {
			Node temp = front;
			while (temp.next != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}

	// Method for delete element from queue or dequeue operation
	public void dequeue() {
		if (front == null)
			System.out.println("\n" + "Queue Underflow");

		Node temp = front;
		System.out.printf("Removing %d\n", temp.data);
		front = front.next;

		if (front == null)
			rear = null;

	}

}
