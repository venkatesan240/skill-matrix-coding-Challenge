package Bank;

public class BankC implements Bank{

	double balance;
	
	public BankC(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		return balance;
	}

}
