package practicos.ejercicio3;

public class Ejercicio3 {
	
	
	/**
	 * Calculates the maximum between two integer values
	 * @param x is one of values to calculate max from
	 * @param y is the other value to calculate max from
	 * @return the maximum between x and y.
	 */
	public static int max(int x, int y) {
		return (x>=y?x:y);
	}
	
	
	public static int lastZero (int[] x) {
		//Effects: If x is null throw NullPointerException,
		// else return the index of the LAST 0 in x.
		// Return -1 if 0 does not occur in x
		
		// TODO: Copiar aquí la versión corregida en el ejercicio 1
		for (int i=x.length-1; i >= 0; i--)
		{
			if (x[i] == 0)
			{
				return i;
			}
		}
		return -1;
	}
	

	public static int findLast (int[] x, int y) {
		//Effects: If x==null throw NullPointerException
		// else return the index of the last element
		// in x that equals y.
		// If no such element exists, return -1
		
		// TODO: Copiar aquí la versión corregida en el ejercicio 1
		for (int i=x.length-1; i >= 0; i--)
		{
			if (x[i] == y)
			{
				return i;
			}
		}
		return -1;
	}
		
	
	/**
	* Returns the largest element in an array.
	* @param list is an array of integers
	* @return The largest number in the given array
	*/
	public static Integer largest(Integer[] list) { 
		int index = 0;
		int max = Integer.MIN_VALUE;
		while (index <= list.length-1) {
			if (list[index] > max) {
				max = list[index];
				index++;
			}
		}
		return max;
	}

	
	/**
	* Sorts an array in increasing order.
	* @param An array of integers
	*/	
	public static void bubbleSort(int[] array) {
		for (int l = array.length-1; l>1; l--) {
			for (int i = 0; i<l; i++) {
				if (array[i]>array[i+1]) {
					int e = array[i];
					array[i] = array[i+1];
					array[i+1] = e;
				}
			}
		}
	}
	
	
}
