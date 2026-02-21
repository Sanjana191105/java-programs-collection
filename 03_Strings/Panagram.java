package basic_problems;

import java.util.Scanner;

public class Panagram {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase();
		boolean isPanagram=true;
		for(char ch='a';ch<='z';ch++) {
			if(s.indexOf(ch)==-1) {
				isPanagram=false;
				break;
			}
		}
		if(isPanagram) {
			System.out.println("true");
		}
		else {
			System.out.println("not true");
		}
	}

}
