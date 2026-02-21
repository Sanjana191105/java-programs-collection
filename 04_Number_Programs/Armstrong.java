package basic_problems;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp=num;
		int c=0;
		int org =num;
		while(temp!=0) {
			int digit = temp%10;
			c++;
			temp/=10;
		}
		int sum=0;
		while(num!=0) {
			int digit = num%10;
			sum += Math.pow(digit,c);
			num/=10;
		}
		if(sum==org) {
			System.out.println("Amstrong number");
		}
		else {
			System.out.println("Not an Amstrong number");
		}

	}

}
