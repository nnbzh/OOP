package Intr;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

import com.sun.jdi.Value;

public class Teacher extends Employee {
	
	private int teacherID;
	private Vector<Course> teacherCourses = new Vector<Course>();
	HashMap<Integer, Student> teacherStudents = new HashMap<Integer,Student>();
	Vector<Order> sending;
	Vector<CourseFile> files = new Vector<CourseFile>();
	
//--------------------------------------Constructor
	public Teacher(String name, String surname, String login, String password, int salary) {
		super(name, surname, login, password, salary);
		this.teacherID = Database.teachers.size() + 1;
	}
	
	public int getTeacherID() {
		return this.teacherID;
	}
//--------------------------------------Menu	
	public void getMenu() {
		System.out.println("What do you want to do?");
		System.out.println("\n 1) Add course \n 2) Manage courses \n 3) View students \n 4) Put marks \n 5) Send order \n 6) Exit");
	}
//--------------------------------------1
	public void addCourse(int courseID) {
		Course c = Database.courses.elementAt(courseID - 1);
		teacherCourses.add(c);
		Database.courses.elementAt(c.getCourseID() - 1).addTeacher(this);
	}
	public void showAvailableCourseList() {
		for (Course c: Database.courses) {
			System.out.println(c.getCourseID() + ") " + c.getCourseName());
		}
	}
	
//----------------------------------------2
	public void manageCourseMenu() {
		System.out.println("n 1) View my courses 2) Add course file \n 3) Delete course file 4) Exit");
	}
	public void viewMyCourses() {
		for (Course c: teacherCourses) {
			System.out.println("Course ID:" + c.getCourseID() + " Course name: "+ c.getCourseName());
		}
	}
	
	
//----------------------------------------3	
	public void viewMyStudents(int courseID) {
		for (int i = 0; i < teacherStudents.size();i++) {
			Student s = teacherStudents.get(courseID);
			System.out.println(s.getInfo());
		}
	}
	
	public void addCourseFile(String fileName) {
				files.add(new CourseFile(fileName));
	}
	
	public void removeCourseFile(String filename) {
		for(int i = 0; i < files.size(); i++) {
			if(files.elementAt(i).fileName.equals(filename))
				files.remove(i);
			else 
				System.out.println("No such file!");
		}
	}

//----------------------------------------4
	
	
//----------------------------------------5
	public void sendOrder(String name, int number) {
			Order o = new Order(this.teacherID, name, number);
			Database.orders.add(o);
	}
}
