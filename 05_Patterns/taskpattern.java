package JAVA;

public class taskpattern {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0;i<=3;i++) {
			for(int j=0;j<3-i;j++) {
				    System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i=2;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		;
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		

	  }
	}
	