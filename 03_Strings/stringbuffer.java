package JAVA;
import java.util.Scanner;
public class stringbuffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		StringBuffer sb = new StringBuffer(a);
		sb.append(" java");
		System.out.println(sb);
		sb.insert(6, "world ");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(15, 17);
		System.out.println(sb);

	}

}
