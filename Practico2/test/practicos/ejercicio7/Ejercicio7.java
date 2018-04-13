package practicos.ejercicio7;

import static org.junit.Assume.assumeTrue;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith (Theories.class)
public class Ejercicio7 {
	
	@DataPoints
	public static int[] x = {2,4,-7,-8,9,1,0,-6};
	

	@Theory
	public void matMaxAbs(int a, int b, int p)  // Parameters!
	{
		assumeTrue (Math.max(a, b) == Math.max(b, a));          // Assume
		assumeTrue (Math.max(a, b) >= a);  					    // Assume
		assumeTrue (Math.max(a, b) >= b); 				        // Assume
		assumeTrue (p + Math.max(a,b) == Math.max(p+a, p+b));   // Assume
		
		// |a-b| = |b-a|
		int res = Math.abs(a-b);
		assertThat (res, equalTo(Math.abs(b-a)));      						// Assert
		
		// |a+b| <= |a|+|b|
		int res2 = Math.abs(a+b);
		assertThat (res2, lessThanOrEqualTo(Math.abs(a) + Math.abs(b)));	// Assert
	}
	
	
	@Theory
	public void matMaxDiv(int a, int b, int p)  // Parameters!
	{	
		assumeTrue (Math.max(a, b) == Math.max(b, a));          // Assume
		assumeTrue (Math.max(a, b) >= a);  					    // Assume
		assumeTrue (Math.max(a, b) >= b); 				        // Assume
		assumeTrue (p + Math.max(a,b) == Math.max(p+a, p+b));   // Assume
		assumeTrue (a!=0);

		// a/1 = a
		int res = (a/1);
		assertThat (res, equalTo(a));   // Assert
		
		// 0/a = a
		int res2 = (0/a);
		assertThat (res2, equalTo(0));	// Assert
	}
}
