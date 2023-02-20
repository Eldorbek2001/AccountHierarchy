package models;

//Ali Elbekov
public class RegularAccount extends BankAccount{
	
	// Allows deposits > 0.00 and withdrawals up to the balance only. No balance must ever be negative.
	
	
	public RegularAccount(){
		super();
		
	}
	
	public String toString() {
		return "Regular Account(balance:"+this.balance+" , id:"+this.accountNumber+")";
	}
	
	
	
	@Override
	public void deposit(double amount) {
		
	}
	
	@Override
	public void withdraw(double amount) {
		
	}
}
