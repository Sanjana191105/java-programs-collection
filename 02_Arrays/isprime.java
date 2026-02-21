package JAVA;

import java.util.Scanner;

public class isprime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 1) {
			System.out.println("Invalid no");
		}
		else if(n==1) {
			System.out.println("Not a Prime");
		}
		else {
			boolean isprime = true;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					isprime = false;
					break;
				}
			}
			if(isprime) {
				System.out.println("Prime number");
			}
			else {
				System.out.println("not a prime number");
			
			}
		}

	}

}
