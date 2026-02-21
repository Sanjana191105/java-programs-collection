package JAVA;

import java.util.Scanner;

public class busprog {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int capacity = sc.nextInt();
//		int[] arr = new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i] = sc.nextInt();
//		}
//		int buscount=1;
//		int currentbus=0;
//		for(int i=0;i<n;i++) {
//			if(arr[i]>capacity) {
//				System.out.println("group of people is high!");
//			}
//			else {
//				if (currentbus + arr[i] <= capacity) { 
//					currentbus = currentbus + arr[i]; 
//					} 
//				else { 
//					buscount++;
//					currentbus = arr[i]; 
//					}
//			}
//		}
//		System.out.println(buscount);
//		
//	}
//
//}



    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       int total = 0;
       int [] a = new int[n];
       for(int i = 0; i<n; i++){
           total += sc.nextInt();
       }
       int buses = (total + m - 1)/m;
       System.out.println(buses);
    }
}

