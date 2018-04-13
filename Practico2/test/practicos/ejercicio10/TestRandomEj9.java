package practicos.ejercicio10;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assume.assumeThat;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import practicos.ejercicio6.Pair;

@RunWith (Theories.class)
public class TestRandomEj9 {

	@Theory
	public void swapSwapIsEqual(@RandomPair(n=10) Pair a)  // Parameters!
	{
		assumeThat(a.getX(),not(0));
		assumeThat(a.getY(),not(0));
		
		Pair b = new Pair(a.getX(),a.getY());
		a.swap();
		a.swap();
		System.out.println("a: "+a+", b : "+b);
		assertThat(a,equalTo(b));	
	}
}
