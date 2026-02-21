package JAVA;

import java.util.Scanner;

public class routine2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] =s.nextInt();
		}
		int temp = a[n-1];
		for(int i=n-2;i>=0;i--) {
			a[i+1]=a[i];
		}
		a[0] = temp;
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		s.close();
	}

}
