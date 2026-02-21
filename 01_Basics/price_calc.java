package JAVA;
import java.util.Scanner;

public class price_calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float Fprice = sc.nextFloat();
		float Fdiscount = sc.nextFloat();
		float Fshipping_charge = sc.nextFloat();
		float sprice = sc.nextFloat();
		float sdiscount = sc.nextFloat();
		float sshipping_charge = sc.nextFloat();
		float aprice = sc.nextFloat();
		float adiscount = sc.nextFloat();
		float ashipping_charge = sc.nextFloat();
		
		float fprice_tot = (float) (Fprice - (Fprice*Fdiscount/100.0)+Fshipping_charge);
		float sprice_tot = (float) (sprice - (sprice*sdiscount/100.0)+sshipping_charge);
		float aprice_tot = (float) (aprice - (aprice*Fdiscount/100.0)+ashipping_charge);
		
		if(fprice_tot <= sprice_tot && fprice_tot<=aprice_tot ) {
			System.out.println("Buy in filpkart");
		}
		else if(sprice_tot <= fprice_tot && sprice_tot<=aprice_tot) {
			System.out.println("Buy in snapdeal");
		}
		else {
			System.out.println("Buy in Amazon");
		}

	}

}
