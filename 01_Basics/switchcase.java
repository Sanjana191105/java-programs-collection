package JAVA;
import java.util.Scanner;
public class switchcase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		switch(a) {
		case 'O':
			System.out.println("OutStanding");
			break;
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Very Good");
			break;
		case 'C':
			System.out.println("Good");
			break;
		case 'D':
			System.out.println("Satisfactory");
			break;
		case 'U':
			System.out.println("Need Improvement");
			break;
		case 'R':
			System.out.println("Poor");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
		sc.close();
	}

}
