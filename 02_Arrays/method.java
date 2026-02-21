package JAVA;

public class method {
	
	int square(int num) {
		return num*num;
	}
	int maxnum(int a,int b) {
		return (a>b)? a :b;
	}

	public static void main(String[] args) {
		method obj=new method();
		System.out.println(obj.maxnum(22,3));
		System.out.println(obj.square(5));
	}

}
