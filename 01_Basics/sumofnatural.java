package JAVA;

public class sumofnatural {
	
	int sum(int num) {
	    if (num <= 0) {
	        return 0;
	    } else {
	        return num + sum(num - 1);
	    }
	}

	
	public static void main(String[] args) {
		sumofnatural obj = new sumofnatural();
		int n= obj.sum(-1);
		System.out.println(n);

	}

}
