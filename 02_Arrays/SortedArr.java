package basic_problems;

import java.util.Scanner;

public class SortedArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int smallest=arr[0];
		boolean isAsc = true;
		for(int i=1;i<n;i++) {
			if(arr[i]<smallest) {
				isAsc =false;
				break;
			}
			else {
				smallest = arr[i];
			}
		}
		if(isAsc) {
			System.out.println("Ascending number");
		}
		else {
			System.out.println("Not an Ascending number");
		}

	}

}
