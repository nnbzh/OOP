package Intr;

public abstract class User implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String surname;
	private int userID;
	private String login;
	private String password;
		
	public User () {};
	public User(String name, String surname, String login, String password) {
		this.name = name;
		this.surname = surname;
		this.login = login;
		this.password = password;
		this.userID = Database.users.size()+1;
	}
	public String getInfo() {
		return name + ' ' + surname;
	}	
	public int getUserID() {
		return userID;
	}
	
	public String getPass() {
		return password;
	}
	public String getLogin() {
		return login;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	} 
	public void setPassword(String password) {
		this.password = password;
	}
	public abstract void getMenu();
}
