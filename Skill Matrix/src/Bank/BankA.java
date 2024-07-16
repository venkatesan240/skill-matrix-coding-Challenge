package Bank;

public class BankA implements Bank{
	
	double balance;

	public BankA(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		
		return balance;
	}

}
