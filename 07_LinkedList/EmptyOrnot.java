package DSA;

class LNode{
	int data;
	LNode next;
	LNode(int data){
		this.data = data;
	}
}
class LinkedList{
	LNode head ,tail;
	public void insert(int data) {
		LNode n = new LNode(data);
		n.next = null;
		if(head == null) {
			head = n;
			tail =n;
		}
		else {
			tail.next=n;
			tail=n;
		}
	}
	public void display() {
//		LNode temp = head;
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			System.out.println("List is Not Empty");
		}
		
	}
}
public class EmptyOrnot {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.insert(10);
//		l.insert(20);
		l.display();

	}

}
