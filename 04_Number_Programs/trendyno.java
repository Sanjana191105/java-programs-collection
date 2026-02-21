package JAVA;

import java.util.Scanner;

public class trendyno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number<100 && number >=1000) {
			System.out.println("Enter a vaild number :");
		}
		else {
			int fir_two=number/10;
			int mid_no = fir_two%10;
			if(mid_no%3==0) {
				System.out.println("Trendy number!");
			}
			else {
				System.out.println("Not an Trendy number!");
			}
		}

	}

}
