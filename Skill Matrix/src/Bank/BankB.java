package Bank;

public class BankB implements Bank {

	double balance;
	
	
	public BankB(double balance) {
		super();
		this.balance = balance;
	}


	@Override
	public double getBalance() {
		return balance;
	}

}
