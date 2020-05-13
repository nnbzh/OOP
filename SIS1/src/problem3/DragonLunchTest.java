package problem3;

import java.util.Vector;

public class DragonLunchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Person> kdPeople = new Vector<Person>();
		DragonLunch newDragonLunch = new DragonLunch(kdPeople);
		
		kdPeople = newDragonLunch.inputPerson(kdPeople);	
		
		System.out.print(newDragonLunch.willDragonEatorNot());
	}
}
