package basic_problems;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("No prime number");
		}
		else if(n==1) {
			System.out.println("Not a prime number");
		}
		else {
			boolean isprime = true;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					isprime =false;
					break;
				}
			}
			if(isprime) {
				System.out.println("The num is a prime number");
			}
			else {
				System.out.println("The num is a not prime number");
			}
		}
	}

}