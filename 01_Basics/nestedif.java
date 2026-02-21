package JAVA;

public class nestedif {

	public static void main(String[] args) {
		int age=55;
		if(age>=18) {
			System.out.println("Eligible to Vote");
			if(age>=19 && age<25) {
				System.out.println("Adult Vote");
			}
			if(age>=25 && age<59) {
				System.out.println("Senior Vote");
			}
			if(age>=60) {
				System.out.println("Senior Citizen Vote");
			}
		}
		else {
			System.out.println("Not eligible to Vote");
		}

	}

}
