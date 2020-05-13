package Task4;

import labka2.Time;

public class Chocolate implements Comparable{
	int weight;
	String name;
	Chocolate (String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	
	@Override
	public int compareTo(Object o) {
		Chocolate other = (Chocolate) o;
		if (this.weight> other.weight) return 1;
		else if (this.weight== other.weight) return 0;
		else return -1;
	}

}
