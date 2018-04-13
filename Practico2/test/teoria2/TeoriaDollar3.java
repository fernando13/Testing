package teoria2;

import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import teoria2.Dollar;

import static org.junit.Assert.*;
import static org.junit.Assume.*;
import static org.hamcrest.CoreMatchers.*;


@RunWith(Theories.class)
public class TeoriaDollar3 {
	
		
	
	@Theory 
	public void multiplyIsInverseOfDivide(@SimpleIntGen int amount, @SimpleIntGen int m) {
		System.out.println("Amount: " + amount + ", m: " + m);
		assumeThat(m, not(0));
		assertThat(new Dollar(amount).times(m).divideBy(m).getAmount(), equalTo(amount));
	}
	
	
}
