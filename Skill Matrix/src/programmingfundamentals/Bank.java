package programmingfundamentals;

import java.util.ArrayList;
import java.util.Scanner;

import validation.RegexValidation;

public class Bank {
	
	public static void main(String[] args) {
		RegexValidation valid=new RegexValidation();
		
		String name;
		String accountNumber;
		String branch;
		int existingBalance=10000;
		int withdrawl;
		int balance;
		Scanner scanner=new Scanner(System.in);
		ArrayList names=new ArrayList();
		ArrayList accountNumbers=new ArrayList();
		ArrayList ifscs=new ArrayList();
		while(true) {
			System.out.println("Enter the name:");
			name=scanner.next();
			Boolean validName = valid.isValidName(name);
			if(!validName) {
				System.out.println("please enter only letters and minumum of 5 character");
			}
			else {
				names.add(name);
				break;
			}
		}
		while(true) {
			System.out.println("Enter the account number:");
			accountNumber=scanner.next();
			boolean validNumber = valid.isValidNumber(accountNumber);
			if(!validNumber) {
				System.out.println("account number must be number and contain 12 numbers");
			}
			else {
				accountNumbers.add(accountNumber);
				break;
			}
		}
		while(true) {
			System.out.println("Enter ifsc code:");
			String ifsc=scanner.next();
			boolean isvalidIfsc = valid.isvalidIfsc(ifsc);
			if(!isvalidIfsc) {
				System.out.println("first 4 capital letters,5th is zero,6 digits(branch code)");
			}
			else {
				ifscs.add(ifsc);
				break;
			}
		}
		System.out.println("Registered sucessfull..");
		System.out.println("for Transaction:");
		while(true) {
			System.out.println("Enter the name:");
			name=scanner.next();
			Boolean validName = valid.isValidName(name);
			if(!validName) {
				System.out.println("please enter only letters and minumum of 5 character");
			}
			else {
				if(names.contains(name)) {
					break;
				}else {
					System.out.println("not valid name");
				}
			}
		}
		while(true) {
			System.out.println("Enter the account number:");
			accountNumber=scanner.next();
			boolean validNumber = valid.isValidNumber(accountNumber);
			if(!validNumber) {
				System.out.println("account number must be number and contain 12 numbers");
			}
			else {

				if(accountNumbers.contains(accountNumber)) {
					break;
				}else {
					System.out.println("not valid account number");
				}
				
			}
		}
		while(true) {
			System.out.println("Enter ifsc code:");
			String ifsc=scanner.next();
			boolean isvalidIfsc = valid.isvalidIfsc(ifsc);
			if(!isvalidIfsc) {
				System.out.println("first 4 capital letters,5th is zero,6 digits(branch code)");
			}
			else {
				if(ifscs.contains(ifsc)) {
					break;
				}else {
					System.out.println("not valid ifsc code");
				}
			}
		}
		System.out.println("Enter  the choice");
		System.out.println("1.withdraw");
		System.out.println("2.deposit");
		int choice=scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the withdraw amount:");
			withdrawl=scanner.nextInt();
			balance=existingBalance-withdrawl;
			System.out.println("After withdrawl:"+balance);
			break;
		case 2:
			System.out.println("Enter the deposit amount:");
			int deposit=scanner.nextInt();
			balance=existingBalance+deposit;
			System.out.println("after deposit"+balance);
			break;
		}
	}
}
