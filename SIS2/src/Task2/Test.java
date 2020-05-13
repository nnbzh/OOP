package Task2;

import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		Vector<Account> v = new Vector<Account>();
		Bank hBank = new Bank(v);
		CheckingAccount c = new CheckingAccount(123);
		CheckingAccount c1 = new CheckingAccount(124);
		hBank.openAccount(c);
		hBank.openAccount(c1);
		c.deposit(500);
		c.withdraw(300);
		hBank.update();
		hBank.closeAccount(c);
		for(Account a: v) {
			System.out.println(a.toString());
		} 
	}
}
