package Task4;

public class Sort {
	static <E> void swap(E [] array, int i, int j) {
		E o;
		o = array[i];
		array[i] = array[j];
		array[j] = o;
		}
		
		static <E extends Comparable<E>> void bubbleSort(E []
		array) {
			int i, j;  
		    for (i = 0; i<=array.length - 1; i++) {
		    	for (j = 1; j <= array.length - 1; j++) {
		    		if (array[i].compareTo(array[j])==1) {
		    			swap(array, i,j);
		    		}
		    	}
		    }
		}
}
