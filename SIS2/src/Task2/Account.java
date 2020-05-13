package Task2;

public class Account {
	private double balance;
	private int accNumber;
	
	
	public Account(int a) {
		balance = 0;
		accNumber = a;
	}
	
	public void deposit(double sum) {
		this.balance = balance + sum;
	}
	
	public void withdraw(double sum) {
		if(this.balance < sum) {
			System.out.println("Your account doesn't have a sufficient balance to make a transfer.");
		} else {this.balance = balance - sum;}
		
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccountNumber() {
		return accNumber;
	}
	
	public void transfer(double amount, Account other) {
		if(this.balance < amount) {
			System.out.println("Your account doesn't have a sufficient balance to make a transfer.");
		} else {other.balance = amount + other.balance;
		this.balance = this.balance - amount;}
	}
	public String toString () {
		return "Account number is: " + accNumber + "\n" + "Your balance is: " + balance;
		
	}
}
