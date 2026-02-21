package DSA;

class linode{
	int data;
	linode next;
	linode(int data){
		this.data = data;
	}
}
class LSingle{
	linode head,tail;
	public void insert(int data) {
		linode n = new linode(data);
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
	    linode temp = head;
	    int count = 0;
	    while (temp != null) {
	        count++;
	        temp = temp.next;
	    }
	    int pos = count / 2;
	    temp = head;

	    for (int i = 0; i < pos; i++) {
	        temp = temp.next;
	    }
	    System.out.println(temp.data);
	}

}
public class MiddleElem {

	public static void main(String[] args) {
		LSingle l = new LSingle();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(50);
		l.insert(60);
		l.insert(70);
		l.display();

	}

}
