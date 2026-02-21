package JAVA;

class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
	}
}
class linkedlist {
	Node head, tail;
	 public void insert(int data) {
		 Node n = new Node(data);
		 n.next = null;
		 if(head == null) {
			 head = n;
			 tail = n;
		 }
		 else {
			 tail.next = n;
			 tail = n;
		 }
	 }
	 
	 void insertAtBegin(int data) {
		 Node n = new Node(data);
		 n.next = head;
		 head  = n;
	 }
	 
	 void insertAtPos(int position,int data) {
		 Node n = new Node(data);
		 Node temp = head;
		 for(int i=0;i<position-1;i++) {
			 temp = temp.next;
		 }
		 n.next = temp.next;
		 temp.next= n;
	 }
	 
	 public void display() {
		 Node temp = head;
		 while(temp.next!=null) {
			 System.out.println(temp.data);
			 temp = temp.next;
		 }
		 System.out.println(temp.data);
	 }
}
class Main {
    public static void main(String[] args) {
    	linkedlist list = new linkedlist();
    	list.insert(11);
    	list.insert(22);
    	list.insert(33);
    	list.insert(44);
    	list.insertAtBegin(10);
    	list.insertAtPos(4, 55);
    	list.display();
    }
}
