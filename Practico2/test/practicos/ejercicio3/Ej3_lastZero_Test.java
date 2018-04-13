package practicos.ejercicio3;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import practicos.ejercicio3.Ejercicio3;


@RunWith(Parameterized.class)
public class Ej3_lastZero_Test {
	
	int[]a;
	int result;

	public Ej3_lastZero_Test(int[]v1, int expected)
	{this.a = v1; this.result = expected;}
	
	@Parameters public static Collection<Object[]> parameters(){
		int[]c = {0,0,0};
		int[]d = {1,0,3};
		return Arrays.asList(new Object[][]{ {c,2}, {d,1} });
	}
	
	@Test
	public void lastZeroParamTest() {
		assertTrue(result == Ejercicio3.lastZero(a));
	}
}

