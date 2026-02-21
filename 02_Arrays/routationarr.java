package JAVA;

import java.util.Scanner;

public class routationarr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] =s.nextInt();
		}
		int temp=a[0];
		for(int i=0;i<n-1;i++) {
			a[i]=a[i+1];
		}
		for(int i=0;i<n-1;i++) {
			System.out.println(a[i]);
		}
		System.out.println(temp);
	
		s.close();

	}

}
