package JAVA;

import java.util.Scanner;

public class fibb {
//		int fibb(int num) {
//			if(num==0)
//				return 0;
//			if(num==1)
//				return 1;
//			return fibb(num-1) + fibb(num-2);
//		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int a=0,b=1,c;
			for(int i=1;i<=num;i++) {
				System.out.println(a+ " ");
				c=a+b;
				a=b;
				b=c;
			}
				

	}

}
