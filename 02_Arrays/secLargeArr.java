package JAVA;
import java.util.Arrays;
import java.util.Scanner;
public class secLargeArr {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
	    int large = 0;
	    int seclarge=0;
		for(int i=0;i<n;i++) {
				if(arr[i]>large) {
					seclarge=large;
					large=arr[i];
			}
				else if(arr[i]<large && arr[i]>seclarge) {
					seclarge=arr[i];
				}
		}
		System.out.println(seclarge);
		s.close();

	}

}
