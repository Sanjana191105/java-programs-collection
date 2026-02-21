package basic_problems;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		if(s1.length()!=s2.length()) {
			System.out.println("Not a Anagram");
		}
		else {
			boolean istrue = true;
			for(int i=0;i<s1.length();i++) {
				char ch = s1.charAt(i);
				int c1=0,c2=0;
				for(int j=0;j<s2.length();j++) {
					if(s1.charAt(j)==ch) {
						c1++;
					}
					if(s2.charAt(j)==ch) {
						c2++;
					}
				}
				if(c1!=c2) {
					istrue=false;
					break;
				}
			}
			if(istrue) {
			System.out.println("Anagram");
		}
			else {
				System.out.println("Not an Anagram");
			}

		}
		
	}

}
