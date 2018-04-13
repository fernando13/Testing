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
public class Ej3_findLast_Test {
	
	int[] a;
	int b;
	int result;

	public Ej3_findLast_Test(int[]v1,int v2, int expected)
	{this.a = v1; this.b = v2; this.result = expected;}
	
	@Parameters public static Collection<Object[]> parameters(){
		int[]c = {1,2,2,3,4};
		int[]d = {1,2,3,4,5};
		return Arrays.asList(new Object[][]{ {c,3,3}, {d,1,0} });
	}
	
	@Test
	public void lastZeroParamTest() {
		assertTrue(result == Ejercicio3.findLast(a,b));
	}
}

