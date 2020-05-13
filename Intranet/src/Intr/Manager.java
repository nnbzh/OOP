package Intr;

import java.util.Collections;

public class Manager extends Employee{

	public Manager(String name, String surname, String login, String password, int salary) {
		super(name, surname, login, password, salary);
	}
	
	public void getMenu() {
		System.out.println("What do you want to do?");
		System.out.println("\n 1) Open course for reg \n 2) Manage courses \n 3) View students \n 4) Put marks \n 5) Send order \n 6) Exit");
	}
	
	public void openCourseByID(int coureID) {
		Database.courses.elementAt(coureID - 1).openRegForCourse();
	}
	
	public void showOpenCourses() {
		for (Course c: Database.courses) {
			if (!c.teachers.isEmpty()) {
				System.out.println("Course ID " + c.getCourseID() + " Course name: " + c.getCourseName() + " Speciality: " + c.getSpeciality() + " Year: " + c.getYearOfStudy());
			}
		}
	}
	public void viewStudentandTeacher() {
		NameSort sort = new NameSort();
		System.out.print("Student's list");
		Collections.sort(Database.students, sort);
		for (Student c: Database.students) {
			System.out.println(c.getInfo());
		}
		System.out.print("Teacher's list");
	}
}
