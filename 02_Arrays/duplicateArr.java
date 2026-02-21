package JAVA;

import java.util.Scanner;

public class duplicateArr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] =s.nextInt();
		}
		int c=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					c +=1;
					break;
				}
			}
		}
		if(c>0) {
			System.out.println("Duplication found");
		}
		else {
			System.out.println("No  Duplicate found");
		}
		s.close();

	}

}
