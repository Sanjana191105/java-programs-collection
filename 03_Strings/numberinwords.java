package JAVA;

import java.util.Scanner;

public class numberinwords {
	
	String convertoword(int num) {
		String[] units= {" ","one","two","three","four","five","six","seven","eight","nine"};
		String[] teens= {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] tens= {" "," ","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		
		String words="";
		
		if(num>=1000) {
			words +=units[num/1000] +" thousand ";
			num=num%1000;
		}
		if(num>=100) {
			words +=units[num/100] +" hundred ";
			num=num%100;
		}
		if(num>=20) {
			words +=tens[num/10] +" ";
			num=num%10;
		}
		else if(num>=10){
			words +=teens[num-10] +" ";
			num=0;
		}
		if(num>0) {
			words +=units[num] + " ";
			
		}
		return words.trim();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		if(num>9999) {
			System.out.println("range is out of bound");
			return;
		}
		numberinwords obj = new numberinwords();
		System.out.println("Number in words: "+obj.convertoword(num));

	}

}
