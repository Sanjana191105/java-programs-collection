package basic_problems;

import java.util.Scanner;

public class PerfectSquares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sq = (int) Math.sqrt(num);
		if(sq*sq == num) {
			System.out.println("Perfect squares");
		}
		else {
			System.out.println("Not a Perfect squares");
		}

	}

}
