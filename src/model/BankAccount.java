package model;

public class BankAccount {

	public double balance;

	public BankAccount() {
		
	}
	
	public BankAccount(double balance1) {
		this.balance = balance1;
	}
	
	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double deposit(double deposit) {
		this.balance = deposit + balance;
		return this.balance;
	}
	
	public double withdrawl(double withdrawl) {
		this.balance = this.balance - withdrawl;
		return this.balance;
	}
	public String salutationMessage() {   return "Account Balance" + balance;  }
}
