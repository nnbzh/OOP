package Intr;

import java.util.Vector;

public class Course implements java.io.Serializable {
	private String courseName;
	private int yearOfStudy;
	private int courseID; 
	private String speciality;
	Vector<Teacher> teachers = new Vector<Teacher>();
	private boolean openForReg;
	Vector<Student> students = new Vector<Student>();
	
	public Course(String courseName, int yearOfStudy, String speciality) {
		this.courseName = courseName;
		this.yearOfStudy = yearOfStudy;
		this.courseID = Database.courses.size()+1;
		this.speciality = speciality;
		this.openForReg = false;
	}
//------------------Getters
	public int getYearOfStudy() {
		return yearOfStudy;
	}
	public int getCourseID() {
		return courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public boolean getRegStatus() {
		return this.openForReg;
	}
	public void openRegForCourse() {
		this.openForReg = true;
	}
	public void closeRegForCourse() {
		this.openForReg = false;
	}
	public void getTeachersOfCourse() {
		for (Teacher tc: teachers) {
			System.out.println(tc.getInfo());
		}
	}
	public String getSpeciality() {
		return speciality;
	}
//------------------Getters
	public void addTeacher(Teacher t) {
		teachers.add(t);
	} 
}
