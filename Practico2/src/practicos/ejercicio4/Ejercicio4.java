package practicos.ejercicio4;

import java.util.List;

public class Ejercicio4 {

	/**
	 * Calculates the maximum between two comparable objects
	 * @param a is one of objects to calculate max from
	 * @param b is the other object to calculate max from
	 * @return the maximum between x and y
	 */	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T extends Comparable> T max(T a, T b) {
		// TODO: implementar este metodo.
		if(a.compareTo(b) > 0){
			return a;	
		}else{
			return b;	
		}
	}

	/**
	 * Computes and returns the largest element of list l
	 * @param l is the list from where the largest is drawn
	 * @return T The largest element of l
	 */
	@SuppressWarnings("rawtypes")
	public static <T extends Comparable> T largest(List<T> l) {		
		T lmax = l.get(0);
		for (int i = 1; i < l.size(); i++) {
			lmax = max(lmax, l.get(i));
		}
		return lmax;
	}
	
	

}
