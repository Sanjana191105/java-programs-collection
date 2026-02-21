package basic_problems;
import java.util.Scanner;
public class NumDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m = sc.nextInt();
		int c=0;
		while(n>0) {
			int d = n%10;
			if(d==m) {
				c++;
			}
			n=n/10;
		}
		System.out.println(c);

	}

}
