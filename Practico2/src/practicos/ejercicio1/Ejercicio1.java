package practicos.ejercicio1;

public class Ejercicio1 {

	// Para cada programa responda:
	// 1- Cuál es el defecto en el programa?
	// 2- Si es posible, provea un test junit que no ejecute el defecto
	// 3- Si es posible, provea un test junit que ejecute el defecto y no resulte en una falla
	// 4- Si es posible, provea un test junit que ejecute el defecto y produzca una falla
	// 5- Corrija el defecto y vuelva a ejecutar los tests hasta que todos sean exitosos

	public static int lastZero (int[] x) {
		//Effects: If x is null throw NullPointerException,
		// else return the index of the LAST 0 in x.
		// Return -1 if 0 does not occur in x
		for (int i = 0; i < x.length; i++)
		{
			if (x[i] == 0)
			{
				return i;
			}
		}
		return -1;
	}
	
	
	public static int countPositive (int[] x) {
		//Effects: If x==null throw NullPointerException
		// else return the number of
		// 	positive elements in x.
		int count = 0;
		for (int i=0; i < x.length; i++)
		{
			if (x[i] >= 0)
			{
				count++;
			}
		}
		return count;
	}
	
	
	public static int oddOrPos(int[] x) {
		//Effects: if x==null throw NullPointerException
		// else return the number of elements in x that
		// are either odd or positive (or both)
		int count = 0;
		for (int i = 0; i < x.length; i++)
		{
			if (x[i]% 2 == 1 || x[i] > 0)
			{
				count++;
			}
		}
		return count;
	}
	
	
	public static int numZero (int[] x) {
		//Effects: if x == null throw NullPointerException
		// else return the number of occurrences of 0 in x
		int count = 0;
		for (int i = 1; i < x.length; i++)
		{
			if (x[i] == 0)
			{
				count++;
			}
		}
		return count;
	}
	
	
	public static int findLast (int[] x, int y) {
		//Effects: If x==null throw NullPointerException
		// else return the index of the last element
		// in x that equals y.
		// If no such element exists, return -1
		for (int i=x.length-1; i > 0; i--)
		{
			if (x[i] == y)
			{
				return i;
			}
		}
		return -1;
	}
}
