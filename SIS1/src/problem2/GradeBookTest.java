package problem2;

import java.util.*;

public class GradeBookTest {

	public static void main(String[] args) {
		List<Student> Studs = new ArrayList<Student>();
		int[] newGrades = new int[Studs.size()];
		Course firstCourse = new Course("Discret Structures", "Description", 3,"Algebra I");
		GradeBook firstGradeBookEver = new GradeBook(Studs, firstCourse, newGrades);
		
		Student s1 = new Student("Nursik","1",2);
		Student s2 = new Student("Lerroy","2",2);
		Student s3 = new Student("George","3",2);
		Student s4 = new Student("Mbappe","4",2);
		Student s5 = new Student("Neymar","5",2);
		Student s6 = new Student("Messsi","6",2);
		Student s7 = new Student("Ronald","7",2);
		Student s8 = new Student("Raulin","8",2);
		Student s9 = new Student("Zidane","9",2);
		
		Studs.add(s1);
		Studs.add(s2);
		Studs.add(s3);
		Studs.add(s4);
		Studs.add(s5);
		Studs.add(s6);
		Studs.add(s7);
		Studs.add(s8);
		Studs.add(s9);
		
		firstGradeBookEver.toString();
	}

}
