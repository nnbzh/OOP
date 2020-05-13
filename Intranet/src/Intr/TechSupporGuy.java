package Intr;

import java.util.Vector;

public class TechSupporGuy extends Employee{
	Vector<Order> acceptable; //can be done
	Vector<Order> done; // done
	Vector<Order> accept; //accepted but not done
	
	public void acceptableOrders() {
		Order a = new Order("Make Schedule", 111);
		Order b = new Order("Replace grade", 222);
		Order c = new Order("Free classroom", 333);
		acceptable.add(a);
		acceptable.add(b);
		acceptable.add(c);
	}
	
	public TechSupporGuy(String name, String surname, String login, String password, int salary) {
		super(name, surname, login, password, salary);
	}
	
	public void getMenu() {
		System.out.println("What do you want to do?");
		System.out.println("\n 1) View new orders \n 2) View done \n 3) View accepted \n 4) Exit");
	}
	
	public void viewNewOrders() {
		for(int i = 0; i < Database.orders.size(); i++) {
			System.out.println(Database.orders.elementAt(i).toString());
		}
	}
	public String isAcceptedOrNot() {
		String result ="";
		for(int i = 0; i < Database.orders.size(); i++) {
			for(int j = 0; j < acceptable.size(); j++) {
				if(Database.orders.elementAt(i).equals(acceptable.elementAt(j))) {
					result = "Accepted";
					done.add(Database.orders.elementAt(i));
					Database.orders.remove(Database.orders.elementAt(i));
				}
				else {
					result = "Cannot be done yet:(";
					accept.add(Database.orders.elementAt(i));
					Database.orders.remove(Database.orders.elementAt(i));
				}
			}
		}
		return result;
	}
	public void viewDone() {
		for(int i = 0; i < done.size(); i++) {
			System.out.println(done.elementAt(i).toString());
		}
	}
	public void viewAccButNotDone() {
		for(int i = 0; i < accept.size(); i++) {
			System.out.println(accept.elementAt(i).toString());
		}
	}
	
}
