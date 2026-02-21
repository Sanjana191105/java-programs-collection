package JAVA;

public class bankacc {

	int accno;
	double balance;
	
	bankacc(int accno,double balance){
		this.accno=accno;
		this.balance = balance;
		System.out.println("Acco no: "+accno+ " balance: "+balance);
		}
	
	void deposit(double amount) {
		balance +=amount;
		System.out.println("Despoisted: "+ amount);
		showBalance();
	}
	
	
	void withdrawal(double amount) {
		if(balance>=amount) {
			balance-=amount;
			System.out.println("Withdrawal amount: "+amount);
			showBalance();
		}
		else {
			System.out.println("Insufficiant balance "+ amount +"! cannot withdraw a amount more than a balance!");
			showBalance();
		}
	}
		void showBalance(){
			System.out.println("Current Balance Amount: "+ balance);
		}

	public static void main(String[] args) {
		bankacc obj = new bankacc(11,5000);
		obj.deposit(2000);
		obj.withdrawal(4000);
		obj.withdrawal(5000);

	}

}
