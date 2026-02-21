package JAVA;

import java.util.Scanner;

public class kaprekar_no {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int c=0;
		while(temp!=0) {
			temp=temp/10;
			c++;
		}
		int multi_no = 1;
		for(int i=1;i<=c;i++) {
			multi_no=multi_no*10;
		}
		System.out.println(multi_no);
		int sq= num*num;
		int split1=num % multi_no;
		int split2=num / multi_no;
		int res = split1+split2;
		if(num==res) {
			System.out.println("Kaprekar number!");
		}
		else {
			System.out.println("Not an Kaprekar number!");
		}

	}

}
