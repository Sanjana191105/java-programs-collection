package DSA;
class stack{
	int[] stack;
	int top;
	int size;
	stack(int size){
		this.size=size;
		stack = new int[size];
		top=-1;
	}

void push(int data) {
	if(top==size-1) {
		System.out.println("Stack overflow");
	}
	else {
		top++;
		stack[top]=data;
	}
 }
void pop() {
	if(top==-1) {
		System.out.println("Stack underflow");
	}
	else {
		System.out.println(stack[top]);
		top--;
	}
}
void display() {
	for(int i=top;i>0;i--) {
		System.out.println(stack[i]);
	}
}
}
public class Stack {

	public static void main(String[] args) {
		stack s = new stack(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.display();
		s.pop();
	}

}
