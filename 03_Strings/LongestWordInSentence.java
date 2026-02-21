package basic_problems;

import java.util.Scanner;

public class LongestWordInSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		String[] word = s.split(" "); 
		String longest ="";
		for(int i=0;i<word.length;i++) {
			if(word[i].length()> longest.length()) {
				longest = word[i];
			}
		}
		System.out.print(longest);

	}

}
