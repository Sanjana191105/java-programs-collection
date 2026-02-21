package JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class alternate_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int[] newArr = new int[n];
		
		int left = 0, right = n - 1;

		for(int k = 0; k < n; k++) {
		    if(k % 2 == 0)
		        newArr[k] = a[right--];
		    else
		        newArr[k] = a[left++];
		}

		if(n % 2 != 0) {
		    newArr[n/2] = a[n/2];
		}

		for(int i=0;i<n;i++) {
			System.out.print(newArr[i]);
		}
	}

}
