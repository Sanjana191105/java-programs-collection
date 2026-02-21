package JAVA;

public class patterntask {

	public static void main(String[] args) {
		int n=5;
		int i,j;
		for(i=0;i<2*n;i++) {
			int totcol= i>n? 2*n-i : i;
			for(j=0;j<totcol;j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}

	}

}
