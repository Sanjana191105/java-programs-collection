package JAVA;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = {1,2,3,4,5};
		System.out.println(arr[2]);  //accessing element 
		arr[4]=100;                  //modifying element 
		System.out.println(arr[4]);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);  //looping through array
		}
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {               
			a[i]=s.nextInt();             //getting input from user
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]); 
		}
		s.close();
	}

}
