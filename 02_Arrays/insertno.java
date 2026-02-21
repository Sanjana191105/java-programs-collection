package JAVA;

import java.util.Scanner;

public class insertno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int newEle = sc.nextInt();
		int pos = sc.nextInt();
		if(pos < 0 || pos > n) {
            System.out.println("Invalid position");
            return;
        }
		int[] arr1 = new int[n+1];
		
		for(int i=0;i<pos;i++) {
			arr1[i] = arr[i];
		}
		arr1[pos]=newEle;
		
		for(int i=pos;i<n;i++) {
			arr1[i+1]=arr[i];
		}
		for(int i=0;i<n+1;i++) {
			System.out.println(arr1[i]);
		}
		

	}

}
