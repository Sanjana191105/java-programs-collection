package JAVA;
import java.util.Scanner;
public class adddiagonal {

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
		int sumDia=0;
		int sumSecDia=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(i==j) {
					sumDia += arr[i][j];
				}
			}
		}
		int i,j;
		for(i=0,j=m-1;i<n && j>=0; i++, j--) {
			sumSecDia += arr[i][j];
		}
		
		int result=sumDia+ sumSecDia;
	
		System.out.println(result);
		sc.close();

	}

}
