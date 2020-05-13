package problem2;


public class Course {
	public String courseName;
	public String courseDescription;
	public int numberOfCredits;
	public String coursePrerequesite;
	
	public Course() {
		courseName = "";
		courseDescription = "";
		numberOfCredits = 0;
		coursePrerequesite = "";
	}
	
	public Course(String courseName, String courseDescription, int numberOfCredits, String coursePrerequesite) {
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.numberOfCredits = numberOfCredits;
		this.coursePrerequesite = coursePrerequesite;
	}
	
	public String toString() {
		
		return "";
	}
	
}
