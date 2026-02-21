package JAVA;
import java.util.Scanner;
public class largeinrow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int m =  sc.nextInt();
		int arr[][] = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int i,j;
		int large=0;
		for( i=0;i<n;i++) {
			for( j=0;j<m;j++) {
				if(arr[i][j]>large) {
					large =arr[i][j];
				}
			}
			System.out.println("Row"+i+":"+  large);
		}
		int clarge=0;
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				if(arr[j][i]>clarge) {
					clarge =arr[j][i];
				}
			}
			System.out.println("Col"+j+":"+  clarge);
		}

	}

}
