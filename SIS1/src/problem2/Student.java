package problem2;


public class Student {
	
	private String studName;
	private String studID;
	private int yearOfStudy;
	
	public Student() {
		studName = "";
		studID = "";
		yearOfStudy = 0;
	}
	
	public Student(String studName, String studID, int yearOfStudy) {
		this.studName = studName;
		this.studID = studID;
		this.yearOfStudy = yearOfStudy;
	}
	
//--------------------------------------Setter
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public void setStudID(String studID) {
		this.studID= studID;
	}
	public void setYearOfStudy(int yearOfStudy ) {
		this.yearOfStudy = yearOfStudy;
	}
	
//--------------------------------------Getter
	public String getStudName() {
		return studName;
	}
	public String getStudID () {
		return studID;
	}
	public int getYearOfStudy() {
		return yearOfStudy;
	}
	
//--------------------------------------
	public void printStudInfo() {
		System.out.print(studName + "| ID:" + studID + "| Year of Study:" + yearOfStudy + " |");
	}
	public String toString() {
		printStudInfo();
		return "";
	}
	
	
	

}
	
	
