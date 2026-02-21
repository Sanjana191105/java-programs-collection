package JAVA;

import java.util.Scanner;

public class collatzNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c=0;
		while(n!=1) {
			if(n%2==0) {
				n=n/2;
				System.out.println(n);
			}
			else {
				n=3*n+1;
				System.out.println(n);
			}
			c++;
		}
		System.out.println(c);

	}

}
