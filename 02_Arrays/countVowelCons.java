package JAVA;
import java.util.*;
public class countVowelCons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.toLowerCase();
		int vcount =0;
		int conscount=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch== 'o' || ch == 'u') {
				vcount++;
			}
			else if(ch>='a' && ch<='z'){
				conscount++;
			}
		}
		System.out.println("Vowel count: "+vcount);
		System.out.println("Consonant count: "+conscount);

	}

}
