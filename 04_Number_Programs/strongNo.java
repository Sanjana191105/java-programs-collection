package JAVA;

import java.util.Scanner;

public class strongNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		int ans=0;
		while(n!=0) {
			int a = n%10;
			int fact=1;
			for(int i=1;i<=a;i++) {
				 fact=fact*i;
			}
		n = n/10;
		sum +=fact;
		if(n==sum) {
			System.out.println("Strong number!");
		}
		else {
			System.out.println("Not Strong number!");
		}
		

	}
	}

}
