package basic_problems;

import java.util.Scanner;

public class NextsmallestPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n=n+1;
		
		while(true) {
			int rev=0;
			int n1=n;
			while(n1!=0) {
			rev = rev*10+(n1%10);
			n1/=10;
		}
		if(rev==n) {
			System.out.println(n);
			break;
		}
		n++;
		}
		
		

	}

}
