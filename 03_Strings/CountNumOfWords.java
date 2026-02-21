package basic_problems;

import java.util.Scanner;

public class CountNumOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] word = s.split(" ");
		int c =0;
		for(int i=0;i<word.length;i++) {
			c++;
		}
		System.out.println(c);

	}

}
