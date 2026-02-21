package JAVA;

import java.util.Scanner;

public class prime_no {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 2) {
			System.out.println("No prime numbers");
		}
		else {
			for(int num=2;num<=n;num++) {
				boolean isPrime = true;
				for(int i=2;i<=num/2;i++) {
					if(num%i ==0) {
						isPrime=false;
					     break;	
					}
				}
				if(isPrime) {
					System.out.print(num+" ");
				}
			}
		}
	}

}
