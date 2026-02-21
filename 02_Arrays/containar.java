package JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class containar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int i,j;
		for(i=0,j=n-1;i<j;i++,j--) {
			System.out.println(a[j] +" "+a[i]);
		}
		if(n % 2 != 0) {
            System.out.println(a[n/2] + " 0");
        }
 
	}

}
