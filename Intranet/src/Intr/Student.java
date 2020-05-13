package Intr;

import java.util.Vector;
import java.util.HashMap;

public class Student extends User {
	
	private int studentID;
	private int yearOfStudy;
	private String speciality;
	Vector<Course> myCourses = new Vector<Course>();
	private HashMap<Course, Mark> courseMark;
	
	public Student(String name, String surname, String login, String password, String speciality,int yearOfStudy) {
		super(name, surname, login, password);
		this.studentID = Database.students.size() + 1;
		this.speciality = speciality;
		this.yearOfStudy = yearOfStudy;
	}
	
	public int getStudentID() {
		return this.studentID;
	}

	@Override
	public void getMenu() {
		System.out.println("What do you want to do?");
		System.out.println("\n 1) Register for course \n 2) View course files \n 3) View teachers of course \n 4) View marks \n 5) View transcript \n 6) Exit");
	}
	public int getYearOfStudy() {
		return yearOfStudy;
	}
	public String getSpeciality() {
		return speciality;
	}
	
	public void showCoursesForRegistration() {
		for(Course c : Database.courses) {
			if (c.getYearOfStudy() == this.getYearOfStudy() && c.getRegStatus() == true && c.getSpeciality().equals(this.speciality)) {
				System.out.println("Course ID: " + c.getCourseID() + " Course Name: " + c.getCourseName());
			} 
		}
		for (Course c: Database.courses) {
			if (c.getYearOfStudy() == this.getYearOfStudy() && c.getRegStatus() == true && c.getSpeciality().equals(this.speciality)) {
				for (Teacher t: c.teachers) {
					System.out.println("Teacher ID: " + t.getTeacherID() + " Name: " + t.getInfo());	
				}	
			}
		}
	}
	public void regForCourse(int courseID, int teacherID) {
		myCourses.add(Database.courses.elementAt(courseID - 1));
		Database.courses.elementAt(courseID - 1).students.add(this);
		Database.teachers.elementAt(teacherID - 1).teacherStudents.put(courseID, this);
	}
}
