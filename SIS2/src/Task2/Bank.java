package Task2;

import java.util.Vector;

public class Bank {
	private Vector<Account> HalykBank = new Vector<Account>();
	
	Bank(Vector<Account> HalykBank) {
		this.HalykBank = HalykBank;
	}
	
	public void update() {
		for(Account a : HalykBank) {
			if(a instanceof CheckingAccount) {
				((CheckingAccount) a).deductFee();
			} else if (a instanceof SavingAccount) {
				((SavingAccount) a).interest();
			}
		}
	}
	
	private boolean checkIfExist (Account a) {
		for(Account b:HalykBank) {
			if (a.getAccountNumber() == b.getAccountNumber()) {
				return true;
			}
		}
		return false;
	}
	public void openAccount(Account a) {
		if (checkIfExist(a) == true) {
			System.out.println("Error! Account with this "+ a.getAccountNumber() +" account number already exists.");
		} else {
			HalykBank.add(a);
		}
	}
	
	public void closeAccount(int accNumber) {
		for (Account a: HalykBank) {
			if (a.getAccountNumber() == accNumber) {
				HalykBank.remove(a);
			}
		}
	}
	public void closeAccount(Account o) {
		for (Account a: HalykBank) {
			if (a.getAccountNumber() == o.getAccountNumber()) {
				HalykBank.remove(a);
			}
		}
	}
}
