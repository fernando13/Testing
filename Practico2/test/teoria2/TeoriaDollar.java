package teoria2;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import teoria2.Dollar;


import static org.junit.Assert.*;
import static org.junit.Assume.*;
import static org.hamcrest.CoreMatchers.*;


@RunWith(Theories.class)
public class TeoriaDollar {
	
	@Test 
	public void multiplyByAnInteger() {
		assertThat(new Dollar(5).times(2).getAmount(), equalTo(10));
	}
	
	@DataPoint
	public static int zero = 0;
	
	@DataPoint
	public static int one = 1;

	@DataPoints
	public static int [] manyints = { 15, 24, 47, 0 };

	@Theory 
	public void multiplyIsInverseOfDivide(int amount, int m) {
		assumeThat(m, not(0));
		assertThat(new Dollar(amount).times(m).divideBy(m).getAmount(), equalTo(amount));
	}
	
	
}
