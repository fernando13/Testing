package practicos.ejercicio1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class countPositiveTest {

	// 2- Si es posible, provea un test junit que no ejecute el defecto
	@Test(expected = NullPointerException.class)
	public void countPositive_2() {
		int[] x = null;
		Ejercicio1.countPositive(x);
	}
	
	// 3- Si es posible, provea un test junit que ejecute el defecto y no resulte en una falla
	@Test
	public void countPositive_3() {
		int[] x = {-1,2,3,4,-4};
		assertTrue( 3 == Ejercicio1.countPositive(x));
	}
	
	// 4- Si es posible, provea un test junit que ejecute el defecto y produzca una falla
	@Test
	public void countPositive_4() {
		int[] x = {-1,0,2,3};
		assertTrue(2 == Ejercicio1.countPositive(x));
	}
}
