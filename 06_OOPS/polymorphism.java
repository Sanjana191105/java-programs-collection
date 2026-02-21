package JAVA;

class a{
	void mark(int a) {
		System.out.println("Mark a:"+a);
		}
}
class b extends a{
	void mark(int b) {
		System.out.println("Mark a:"+b);
		}
}
class c extends b{
	void mark(int c) {
		System.out.println("Mark a:"+c);
		}
}
public class polymorphism {

	public static void main(String[] args) {
		a obj = new a();
		a obj1 = new b();
		a obj2 = new c();
		obj.mark(56);
		obj1.mark(97);
		obj2.mark(86);

	}

}
