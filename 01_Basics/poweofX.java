package JAVA;

import java.util.Scanner;

public class poweofX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int result = 1;
		for(int i=0;i<n;i++) {
			result *=x;
		}
		System.out.println("Result "+result);

	}

}
