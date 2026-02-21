package JAVA;

import java.util.Scanner;

public class largestElementInArr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] =s.nextInt();
		}
		int large=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]>large) {
				large=a[i];
			}
		}
		System.out.println(large);
		s.close();

	}

}
