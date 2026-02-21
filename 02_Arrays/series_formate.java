package JAVA;

import java.util.Scanner;

public class series_formate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i*i - 2);
			}
			else {
				System.out.println(i*i - 1);
			}
		}

	}

}
