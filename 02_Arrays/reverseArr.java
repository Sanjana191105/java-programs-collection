package JAVA;

import java.util.Scanner;

public class reverseArr {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] =s.nextInt();
		}
		int i,j;
		int temp;
		for(i=0,j=n-1;i<j;i++,j--) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		s.close();

	}

}
