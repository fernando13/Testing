package practicos.ejercicio1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class lastZeroTest {
	
	// 2- Si es posible, provea un test junit que no ejecute el defecto 
	@Test(expected = NullPointerException.class)
	public void lastZero_2() {
		int[] x = null;
		Ejercicio1.lastZero(x);
	}
	
	// 3- Si es posible, provea un test junit que ejecute el defecto y no resulte en una falla
	@Test
	public void lastZero_3() {
		int[] x = {1,0,3};
		assertTrue(1 == Ejercicio1.lastZero(x));
	}
	
	// 4- Si es posible, provea un test junit que ejecute el defecto y produzca una falla
	@Test
	public void lastZero_4() {
		int[] x = {0,0,0};
		assertTrue(2 == Ejercicio1.lastZero(x));
	}	
}
