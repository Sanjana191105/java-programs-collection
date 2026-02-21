package JAVA;

public class userdefinedMethods {
	
	void method1() {
		System.out.println("Hello");
	}
	
	void method2(String name) {
		System.out.println("Hello " + name);
	}
	
	int method3() {
		return 19;
	}
	
	int add(int num1,int num2) {
		return num1+num2;
	}

	public static void main(String[] args) {
		userdefinedMethods obj=new userdefinedMethods();
		obj.method1();
		obj.method2("World");
		System.out.println(obj.method3());
		System.out.println(obj.add(5,5));
	}

}
