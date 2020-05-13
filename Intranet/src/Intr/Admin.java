package Intr;

public class Admin extends Employee{

	private static final long serialVersionUID = 1L;
	public Admin(String name, String surname, String login, String password, int salary) {
		super(name, surname, login, password, salary);
	}
	
	public void addTeacher(Teacher t) {
		for (User u : Database.users) {
			if(t.getLogin().equals(u.getLogin())) {
				System.out.println("This login is already used by someone else.");
				break;
			}
		} 
		Database.teachers.add(t);
		Database.users.add(t);
	}
	
	public void addStudent(Student s) {
		for (User us : Database.users) {
			if(s.getLogin().equals(us.getLogin())) {
				System.out.println("This login is already used by someone else.");
				break;
			}
		}

		Database.students.add(s);
		Database.users.add(s);
	}
	public void removeUser(User a) {
		int elementID = a.getUserID() - 1;
		Database.users.remove(elementID);
		if (a instanceof Student) {
			Student s = (Student) a;
			Database.students.remove(s.getStudentID() - 1);
		}
		if (a instanceof Teacher) {
			Teacher t = (Teacher) a;
			Database.teachers.remove(t.getTeacherID() - 1);
		}
	}
	
	public void showUserList() {
		for (User a : Database.users) {
			System.out.println(a.getUserID() + ")" + a.getInfo() + "|" + a.getLogin() + "|" + a.getLogin());
		}
	}
	public void getMenu() {
		System.out.println("What do you want to do?");
		System.out.println("\n 1) Add student \n 2) Add teacher \n 3) Update user  \n 4) Remove user \n 5) Exit");
	}
	public void updateUser(int choice, String updateInfo, int ID) {
		switch(choice) {
		case 1: Database.users.elementAt(ID - 1).setName(updateInfo);
				break;
		case 2: Database.users.elementAt(ID - 1).setSurname(updateInfo);
				break;
		case 3: Database.users.elementAt(ID - 1).setPassword(updateInfo);
				break;
		}
	}
	public User searchByID(int ID) {
		User a = null;
		for(User u:Database.users) {
			if (u.getUserID() == ID) {
				a = u;
				break;
			} 
		}
		return a;
	}
}
