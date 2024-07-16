package Bank;

public class MyBank {

	public static void main(String[] args) {
		BankA banka=new BankA(1000);
		BankB bankb=new BankB(1500);
		BankC bankc=new BankC(2000);
		System.out.println(banka.getBalance());
		System.out.println(bankb.getBalance());
		System.out.println(bankc.getBalance());
	}

}
