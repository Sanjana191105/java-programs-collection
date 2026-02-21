package JAVA;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] =sc.nextInt();
		}
		int i,j,count=0;
		for( i=0,j=n-1;i<j;j--,i++) {
			if(a[i]!=a[j]) {
				count =count+1;
				break;
			}
		}
		if(count>0) {
			System.out.println("Not Palindrome");
		}
		else {
			System.out.println("Palindrome");
		}

		sc.close();

	}

}
