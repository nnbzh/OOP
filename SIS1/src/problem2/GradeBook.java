package problem2;

import java.util.*;


public class GradeBook {
	List<Student> Students = new ArrayList<Student>();
	Course firstCourse = new Course();
	int[] finalGrades;
	public GradeBook(List<Student> Students,Course firstCourse,int[] finalGrades) {
		this.Students = Students;
		this.finalGrades = finalGrades;
		this.firstCourse = firstCourse;
	}
	
	public void displayMessage() {
		System.out.println("Welcome to the grade book for " + firstCourse.courseName + " course!\r\n");
	}
	
	public int[] inputGrades(List<Student> Students) {
		System.out.println("Please, input grades for students:\r\n");
		Scanner inStud = new Scanner(System.in);
		int[] Grades = new int[Students.size()];
		for (int i = 0; i < Students.size();i++) {
			System.out.print(Students.get(i) +": " );
			Grades[i] = inStud.nextInt();
		}
		inStud.close();
		finalGrades = Grades;
		return Grades;
	}
	
	
	public double avGr(List<Student> Students) {
		double totalVal = 0,avgVal = 0;
		for (int i = 0; i < Students.size();i++) {
			totalVal+=finalGrades[i];
		}
		avgVal = totalVal/Students.size(); 
		return avgVal;
	}
	int iMin = 0, iMax = 0;
	public int findMax(List<Student> Students) {
		int maxVal = 0;
		for (int i = 0; i < Students.size();i++) {
			if (finalGrades[i] >= maxVal ) {
				maxVal = finalGrades[i];
				iMax = i;
			}
		}
		return maxVal;
	}
	
	public int findMin(List<Student> Students) {
		int minVal = 100;
		for (int i = 0; i < Students.size();i++) {
			if (finalGrades[i] <= minVal ) {
				minVal = finalGrades[i];
				iMin = i;
			}
		}
		return minVal;
	}
	
	public void outputBarChart() {
		System.out.print("Class average is " + avGr(Students) + ". Lowest grade is " + findMin(Students) + 
				". (" + Students.get(iMin).getStudName() + ", " + Students.get(iMin).getStudID()+")"
		+ ". Highest grade is " + findMax(Students) + ". (" + Students.get(iMax).getStudName() + ", " + Students.get(iMax).getStudID()+")");
	}
	
	
	public String toString() {
		displayMessage();
		inputGrades(Students);
		outputBarChart();
		return "";
	}
}
	

