package practicos.ejercicio1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class findLastTest {

	// 2- Si es posible, provea un test junit que no ejecute el defecto 
	@Test(expected = NullPointerException.class)
	public void findLast_2() {
		int[] x = null;
		Ejercicio1.findLast(x,1);
	}
	
	// 3- Si es posible, provea un test junit que ejecute el defecto y no resulte en una falla
	@Test
	public void findLast_3() {
		int[] x = {1,2,2,3,4};
		assertTrue( 3 == Ejercicio1.findLast(x,3));
	}
	
	// 4- Si es posible, provea un test junit que ejecute el defecto y produzca una falla
	@Test
	public void findLast_4() {
		int[] x = {1,2,3,4,5};
		assertTrue( 0 == Ejercicio1.findLast(x,1));
	}
}
