package DSA;

class node{
	int data;
	node next;
	node(int data){
		this.data = data;
	}
}
class single{
	node head,tail;
	public void insert(int data) {
		node n = new node(data);
		n.next=null;
		if(head==null) {
			head=n;
			tail=n;
		}
		else {
			tail.next=n;
			tail=n;
		}
	}
	public void display() {
		node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		System.out.println(temp.next.data);
	}
}
public class LastELement {

	public static void main(String[] args) {
		single l = new single();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.display();

	}

}
