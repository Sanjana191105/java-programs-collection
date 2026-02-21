package basic_problems;

import java.util.Scanner;

public class FirstNprime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<2) {
			System.out.println("Not a Prime Number");
		}
		else {
			for(int i=2;i<=n;i++) {
				boolean isPrime = true;
				for(int j=2;j<=i/2;j++) {
					if(i%j==0) {
						isPrime=false;
						break;
					}
				}
				if(isPrime) {
					System.out.println(i+" ");
				}
			}
		}

	}

}
