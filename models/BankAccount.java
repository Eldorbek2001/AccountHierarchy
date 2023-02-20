package models;

// Ali Elbekov

abstract class BankAccount {
	
	protected double balance;
	protected int accountNumber;
	private static int numberOfAccounts; 

	BankAccount(){
		
		this.balance = 0;
		numberOfAccounts++;
		this.accountNumber=numberOfAccounts;
	}
	
	protected void withdraw(double amount) {
		balance -= amount;
	}
	
	protected void deposit(double amount) {
		balance += amount;
	}
	
	
	
}
