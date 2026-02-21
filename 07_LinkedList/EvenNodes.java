package DSA;

class nodel{
	int data;
	nodel next;
	 nodel(int data){
		 this.data=data;
	 }
}
class linked{
	nodel head;
	public void insert(int data){
		nodel n = new nodel(data);
		n.next = head;
		head=n;
	}
	public void display() {
		nodel temp=head;
		int count=0;
		while(temp!=null) {
			if(temp.data % 2==0) {
				count++;
			}
			temp=temp.next;
		}
		System.out.println(count);
	}
	
}

public class EvenNodes {

	public static void main(String[] args) {
		linked l = new linked();
		l.insert(10);
		l.insert(1);
		l.insert(24);
		l.insert(51);
		l.insert(37);
		l.insert(28);
		l.display();

	}

}
