package basic_problems;

import java.util.Scanner;

public class Fibbnacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a=0,b=1,c;
		for(int i=1;i<=num;i++) {
		if(i==1 ) {
			System.out.print(a+" ");
		}
		else if(i==2) {
			System.out.print(b);
		}
		else {
				c=a+b;
				System.out.print(" "+c);
				a=b;
				b=c;
			}
		}
	}

}
