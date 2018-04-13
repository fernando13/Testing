package practicos.ejercicio6;

import static org.junit.Assert.*;

import org.junit.Test;

import practicos.ejercicio6.Pair;

/*
Ejercicio 6. Para la clase ejercicio6.Pair.java:
1. Testee el método swap y reporte las fallas encontradas.
2. Implemente el método toString. Cómo puede aprovecharse toString para testear Pair?
3. Implemente y testee el método equals.
*/


/*
	Defecto:
		public int getY() {
		return x;
	}
	
	Defecto: Swap tiene problemas con numero no entero.
	
*/

public class PairTest {

	@Test
	public void swapTest() {         
		Pair a = new Pair(1,2);
		Pair b = new Pair(2,1);
		a.swap();
		assertTrue(a.getX() == b.getX() && a.getY() == b.getY());
	}
	
	
	@Test
	public void equalsOkTest() {         
		Pair a = new Pair(1,2);
		Pair b = new Pair(1,2);
		assertTrue(a.equals(b));
	}
	
	@Test
	public void equalsFailTest() {         
		Pair a = new Pair(1,0);
		Pair b = new Pair(1,2);
		assertFalse(a.equals(b));
	}
	
	@Test
	public void equalsSwapOkTest() {         
		Pair a = new Pair(4,3);
		Pair b = new Pair(3,4);
		a.swap();
		assertTrue(a.equals(b));
	}
	
	@Test
	public void SwapCeroTest() {         
		Pair a = new Pair(4,0);
		Pair b = new Pair(0,4);
		a.swap();					//falla al dividir por cero
		assertTrue(a.equals(b));
	}	
}
