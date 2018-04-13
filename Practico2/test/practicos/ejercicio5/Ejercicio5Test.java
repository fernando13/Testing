package practicos.ejercicio5;

import org.junit.Assert;
import org.junit.Test;

import practicos.ejercicio5.Ejercicio5;

public class Ejercicio5Test {

	@Test(timeout=1000)
	public void test() {
		long res = Ejercicio5.fibonacci(45);
		Assert.assertEquals(res, 1134903170);
	}
}
