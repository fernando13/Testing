package practicos.ejercicio1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class oddOrPosTest {
	
	// 2- Si es posible, provea un test junit que no ejecute el defecto
	@Test(expected = NullPointerException.class)
	public void oddOrPos_2() {
		int[] x = null;
		Ejercicio1.oddOrPos(x);
	}
	
	// 3- Si es posible, provea un test junit que ejecute el defecto y no resulte en una falla
	@Test
	public void oddOrPos_3() {
		int[] x = {-1,-2,1,4,8};
		assertTrue( 3 == Ejercicio1.oddOrPos(x));
	}
	
	// 4- Si es posible, provea un test junit que ejecute el defecto y produzca una falla
	@Test
	public void oddOrPos_4() {
		int[] x = {9,-3,4,-2,-3};
		assertTrue( 4 == Ejercicio1.oddOrPos(x));
	}
}
