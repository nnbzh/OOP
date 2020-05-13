package problem3;

import java.util.*;

public class Person {
	public Gender whatGender;
	
	public Person() {
		whatGender = Gender.MALE;
	}
	public Person(Gender whatGender) {
		this.whatGender = whatGender;
	}
	
	public String toString () {
		return whatGender + " ";
	}
	
	
}
