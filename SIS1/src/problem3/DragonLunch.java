package problem3;

import java.util.Vector;
import java.util.Scanner;


public class DragonLunch {
	public static Vector<Person> kidnappedPeople = new Vector<Person>();
	
	public DragonLunch(Vector<Person> kidnappedPeople) {
		this.kidnappedPeople = kidnappedPeople;
	}
	
	public Vector<Person> inputPerson(Vector<Person> kidnappedPeople) {
		System.out.print("Please, input 1 for MALE or 2 for FEMALE. To break the inputting input any other number: \r\n");
		Scanner nxtInp = new Scanner(System.in);
		while(true) {
			Person p = new Person();
			int key = nxtInp.nextInt();
			if (key == 1) {
				p.whatGender = Gender.MALE;
			} else if (key == 2) {p.whatGender = Gender.FEMALE;} 
			else {
				break;
			}
			kidnappedPeople.add(p);
		} 
		nxtInp.close();
		this.kidnappedPeople = kidnappedPeople;
		return kidnappedPeople;		
	}
	public static boolean willDragonEatorNot(){
		int cnt=0;
		for(Person p : kidnappedPeople){
			if(p.whatGender == Gender.MALE)  
				cnt++;
			else cnt--;
			
			if(cnt<0) return false;				
		}
		
		return cnt==0;
	}
	
}
