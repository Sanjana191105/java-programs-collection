package JAVA;

import java.util.Scanner;

public class room_rent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mon = sc.nextInt();
		int rent = sc.nextInt();
		int days = sc.nextInt();
		if(mon > 12 && mon <= 0){
			System.out.println("Enter vaild number: ");
		}
		else if(mon == 4 || mon==5 || mon==6 || mon== 11 || mon==12) {
			int high_d=(rent*20)/100;
			int tot_rent = (rent*days) + (high_d) ;
			System.out.println("Total rent amount: "+tot_rent);
		}
		else {
			int tot = rent*days;
			System.out.println("Total rent amount: "+tot);
		}
	}

}
