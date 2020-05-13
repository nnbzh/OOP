package Intr;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class Database {
	static Vector<User> users = new Vector<User>();
	static Vector<Course> courses = new Vector<Course>();
	static Vector<Teacher> teachers = new Vector<Teacher>();
	static Vector<Student> students = new Vector<Student>();
	static Vector<Order> orders;
	
	public static void desCourses() throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("C:\\Users\\Nurik\\eclipse-workspace\\Intranet\\src\\Intr\\courses");
		ObjectInputStream oin = new ObjectInputStream(fis);
		courses = (Vector<Course>) oin.readObject();
	}
	public static void serCourses()throws IOException{
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Nurik\\eclipse-workspace\\Intranet\\src\\Intr\\courses");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(courses);
		oos.close();
		fos.close();
	}
	
	public static void desUsers() throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("C:\\Users\\Nurik\\eclipse-workspace\\Intranet\\src\\Intr\\userlist");
		ObjectInputStream oin = new ObjectInputStream(fis);
		users = (Vector<User>) oin.readObject();
	}
	public static void serUsers()throws IOException{
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Nurik\\eclipse-workspace\\Intranet\\src\\Intr\\userlist");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(users);
		oos.close();
		fos.close();
	}
	
	
	public static void update() {
		for (User u : users) {
			if (u instanceof Student) {
				Student s = (Student) u;
				students.add(s);
			}
			if (u instanceof Teacher) {
				Teacher t = (Teacher) u;
				teachers.add(t);
			}
		}
	}
	
	public static void initCourses() {
		courses.add(new Course("Calculus I", 1, "FIT"));
		courses.add(new Course("Calculus II", 1, "FIT"));
		courses.add(new Course("Calculus III", 2, "FIT"));
		courses.add(new Course("PP I", 1, "FIT"));
		courses.add(new Course("PP II", 1, "FIT"));
		courses.add(new Course("Algo", 2, "FIT"));
		courses.add(new Course("Object - Oriented Programming", 2, "FIT"));
	}
}
