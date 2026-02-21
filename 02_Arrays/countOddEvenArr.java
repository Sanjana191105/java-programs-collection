package JAVA;

import java.util.Scanner;

public class countOddEvenArr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] =s.nextInt();
		}
		int counteven=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				counteven +=1;
			}
		}
		System.out.println(counteven);
		int countodd=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2!=0) {
				countodd +=1;
			}
		}
		System.out.println(countodd);
		s.close();

	}

}
