package Intr;

public class Employee extends User implements java.io.Serializable {
	private int salary;
	public Employee(String name, String surname, String login, String password, int salary) {
		super(name, surname, login, password);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void getMenu() {
		// TODO Auto-generated method stub
		
	}
	
	
}
