package JAVA;

import java.util.Scanner;

public class fibonacci {
	
	int fibb(int num) {
		if(num==0)
			return 0;
		if(num==1)
			return 1;
		return fibb(num-1)+fibb(num-2);
	}

	public static void main(String[] args) {
		fibonacci obj = new fibonacci();
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("Fibonacci series: ");
		for(int i = 0; i <= n; i++) {
		    System.out.print(obj.fibb(i) + " ");
		}

	}

}
