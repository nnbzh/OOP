package Intr;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestIntr {
	public static void save() throws IOException, ClassNotFoundException {
		Database.serUsers();
		Database.serCourses();
	}
	public static User authentificate(String login, String password) {
		int cnt = 0;
		User a = null;
		for (User u : Database.users) {
			if (u.getLogin().equals(login) && u.getPass().equals(password)) {
				a = u;
				cnt++;
				}		
			}
			if (cnt == 1) {
				return a;
			} else return null;
	}
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		if(new File("C:\\Users\\Nurik\\eclipse-workspace\\Intranet\\src\\Intr\\userlist").exists()) {Database.desUsers();}
//		Database.users.add(new Admin("Adeke", "Adekovich", "admin", "admin",25));
//		Database.users.add(new Manager("OR","Manager","or_m","or_m", 300000));
		Database.update();
		Database.initCourses();
		Scanner sc = new Scanner(System.in);
		try {
			authentication : while (true) {
			String login = sc.next();
			String password = sc.next();
			User auth = authentificate(login, password);
			if (auth == null) {
				System.out.print("Something went wrong!");
				break;
			}
			else { 
				System.out.println("You have logged in succesfully!");
				System.out.println("Welcome " + auth.getInfo() + "!");
				menu: while(true) {
					if (auth instanceof Admin) {
						((Admin) auth).getMenu();
						int choice = sc.nextInt();
						switch(choice) {
						case 1: System.out.print("Student's name/surname/login/password/yearOfStudy: ");
								((Admin) auth).addStudent(new Student(sc.next(), sc.next(),sc.next(),sc.next(), sc.next(),sc.nextInt()));
								break;
						case 2: System.out.print("Teacher's name/surname/login/password/salary: ");
								((Admin) auth).addTeacher(new Teacher(sc.next(), sc.next(),sc.next(),sc.next(), sc.nextInt()));
								break;
						case 3: System.out.println("Which user you want to update? (Type an ID)");
								((Admin) auth).showUserList();
								int searchID = sc.nextInt();
								System.out.println("Which info you want to update?");
								System.out.print("\n 1) Name \n 2) Surname \n 3) Password");
								int upd = sc.nextInt();
								switch(upd) {
								case 1: System.out.println("New name: ");
										String newName = sc.next();
										((Admin) auth).updateUser(upd, newName, searchID);
										break;
								case 2: System.out.println("New surname: ");
										String newSurname= sc.next();
										((Admin) auth).updateUser(upd, newSurname, searchID);
										break;
								case 3: System.out.println("New password: ");
										String newPass= sc.next();
										((Admin) auth).updateUser(upd, newPass, searchID);
										break;
								}
								break;
						case 4: System.out.println("Which user you want to remove? (Type an ID)");
								int removeID = sc.nextInt();
								((Admin) auth).removeUser(Database.users.elementAt(removeID - 1));
								break;
						case 5: save(); break menu;
						}
					}
					if (auth instanceof Student) {
						((Student) auth).getMenu();
						int choice = sc.nextInt();
						switch(choice) {
						case 1: ((Student) auth).showCoursesForRegistration();
								System.out.println("Here is the list of the courses that are open to register. Type the course ID and teacher ID you want to take");
								((Student) auth).regForCourse(sc.nextInt(), sc.nextInt());
								break;
						case 2: break;
						case 3: break;
						case 4: break;
						case 5: break menu;
						}
					}
					if (auth instanceof Teacher) {
						((Teacher) auth).getMenu();
						int choice = sc.nextInt();
						switch(choice) {
						case 2: ((Teacher) auth).manageCourseMenu();
								int manChoice =sc.nextInt();
								switch (manChoice) {
									case 1: ((Teacher) auth).viewMyCourses(); break;
									case 2: System.out.println("Enter filename");
											((Teacher) auth).addCourseFile(sc.next()); break;
									case 3: System.out.println("Enter filename to rmv");
											((Teacher) auth).removeCourseFile(sc.next()); break;
								}
								System.out.println("");
						case 1:	((Teacher) auth).showAvailableCourseList();
								int ID = sc.nextInt();
								((Teacher) auth).addCourse(ID);
								break;
						case 3: ((Teacher) auth).viewMyCourses();
								System.out.println("Choose the subject");
								((Teacher) auth).viewMyStudents(sc.nextInt());
								break;
						case 5: System.out.println("Type name and number of the order");
								((Teacher) auth).sendOrder(sc.next(), sc.nextInt());
								break;
						case 4: break;
						case 6: break menu;
						}
					}
					if (auth instanceof Manager) {
						((Manager) auth).getMenu();
						int newChoice = sc.nextInt();
						switch(newChoice) {
						case 1: ((Manager) auth).showOpenCourses();
								System.out.println("What course you want to add for registration?");
								((Manager) auth).openCourseByID(sc.nextInt());
								break;
						case 6: break menu;
						}
						
					}
					if (auth instanceof TechSupporGuy) {
						((TechSupporGuy)auth).getMenu();
						int newChoice = sc.nextInt();
						switch(newChoice) {
						case 1: ((TechSupporGuy)auth).viewNewOrders(); break;
						case 2: ((TechSupporGuy)auth).viewDone(); break;
						case 3: ((TechSupporGuy)auth).viewAccButNotDone(); break;
						case 4: break menu;
						}
					}
				}
				
			}
		}
		} finally {};
	}
}
