package practicos.ejercicio1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class numZeroTest {

	// 2- Si es posible, provea un test junit que no ejecute el defecto
	@Test(expected = NullPointerException.class)
	public void numZero_2() {
		int[] x = null;
		Ejercicio1.numZero(x);
	}
	
	// 3- Si es posible, provea un test junit que ejecute el defecto y no resulte en una falla
	@Test
	public void numZero_3() {
		int[] x = {1,1,0,0,0};
		assertTrue( 3 == Ejercicio1.numZero(x));
	}
	
	// 4- Si es posible, provea un test junit que ejecute el defecto y produzca una falla
	@Test
	public void numZero_4() {
		int[] x = {0,0,0,0};
		assertTrue( 4 == Ejercicio1.numZero(x));
	}
}
