package basic_problems;

import java.util.Scanner;

public class SecLargestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int largest=arr[0];
		int secLargest = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>largest) {
				secLargest = largest;
				largest = arr[i];
			}
			else if(arr[i]>secLargest && arr[i]!=largest) {
				secLargest=arr[i];
			}
		}
		System.out.println(largest+" " +secLargest);
		

	}

}
