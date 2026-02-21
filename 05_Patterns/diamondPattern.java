package JAVA;

public class diamondPattern {

	public static void main(String[] args) {
		int n=5;
		int i,j;
	/*	for(i=0;i<2*n;i++) {
			int totcol= i>n? 2*n-i : i;
			
			int no_space=n-totcol;
			for(int s = 0;s < no_space; s++) {
				System.out.print(" ");
				}
			for(j=0;j<totcol;j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
*/
		for(i=1;i<=2*n;i++) {
			
			int c=i>n? 2*n-i: i;
			for(int s=0;s<=n-c;s++) {
				System.out.print(" ");
			}
			for(j=c;j>=1;j--) {
				System.out.print(j);
			}
			for(j=2;j<=c;j++) {
				System.out.print(j);
		}
			System.out.println();
		}
	}

}
