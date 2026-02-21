package basic_problems;

import java.util.Scanner;

public class ProductofN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int pro=1;
		for(int i=1;i<=num;i++) {
			pro *=i;
		}
		System.out.println(pro);
	}

}
