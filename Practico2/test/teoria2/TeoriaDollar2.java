package teoria2;

import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runner.RunWith;

import teoria2.Dollar;

import static org.junit.Assert.*;
import static org.junit.Assume.*;
import static org.hamcrest.CoreMatchers.*;


@RunWith(Theories.class)
public class TeoriaDollar2 {
	

	
	@Theory 
	public void multiplyIsInverseOfDivide(@TestedOn(ints={0, 5, 10}) int amount, @TestedOn(ints={5, 10}) int m) {
		assumeThat(m, not(0));
		assertThat(new Dollar(amount).times(m).divideBy(m).getAmount(), equalTo(amount));
	}

	
	
}
