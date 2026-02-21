package DSA;

class noded{
	int data;
	noded next;
	noded(int data){
		this.data=data;	
	}
}
class singlyl{
	noded head,tail;
	public void insert(int data) {
		noded n = new noded(data);
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
	public void delete() {
		head=head.next;
	}
	public void display() {
		noded temp = head;
		while(temp.next!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print(temp.data);
	}
}


public class deleteAtbegin {

	public static void main(String[] args) {
		singlyl l = new singlyl();
		l.insert(10);
		l.insert(1);
		l.insert(24);
		l.insert(51);
		l.insert(37);
		l.insert(28);
		l.display();
		System.out.println();
		l.delete();
		l.display();
	}

}
