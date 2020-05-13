package Task4;

import labka2.Time;

public class Test {

	public static void main(String[] args) {
		Sort sort = new Sort();
		Chocolate choco = new Chocolate("Kinder", 23);
		Chocolate choco1 = new Chocolate("Kinder", 22);
		Chocolate choco2 = new Chocolate("Kinder", 21);
		Chocolate[] arrC = new Chocolate[3];
		arrC[0] = choco; 
		arrC[1] = choco1;
		arrC[2] = choco2;
		sort.bubbleSort(arrC);
		for (int i = 0; i <= 2; i++) {
			System.out.print(arrC[i].weight + " ");
		}
	}

}
