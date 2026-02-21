package DSA;

class ListNode{
	int data;
	ListNode next;
	ListNode(int data){
		this.data = data;
	}
}
	
	class Singly{
		ListNode head,tail;
		public void insert(int data) {
			ListNode n = new ListNode(data);
			n.next = null;
			if(head==null) {
				head = n;
				tail = n;
			}
			else {
				tail.next=n;
				tail =n;
			}
			
		}

	public void display() {
		ListNode temp = head;
		int count = 1;
		while(temp.next!=null) {
			System.out.print(temp.data+"->");
			count = count+1;
			temp = temp.next;
		}
		System.out.println(temp.data);
		System.out.println(count);
	}
}

public class Traversal {
	public static void main(String[] args) {
		Singly list = new Singly();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.insert(60);
		list.insert(70);
		list.display();
	}

}