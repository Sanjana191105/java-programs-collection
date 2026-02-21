package JAVA;

import java.util.Scanner;

public class perfect_sq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sq = (int)Math.sqrt(n);
		if(sq*sq == n) {
			
			System.out.println("Perfect Square");
		}
		else {
			System.out.println("Not a Perfect square");
		}

	}

}
