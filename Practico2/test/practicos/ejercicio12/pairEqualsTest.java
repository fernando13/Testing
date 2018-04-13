package practicos.ejercicio12;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assume.assumeTrue;

import org.junit.Test;

import practicos.ejercicio10.RandomPair;
import practicos.ejercicio6.Pair;

@RunWith (Theories.class)
public class pairEqualsTest {
	
	@Theory
	public void simetria(@RandomPair(n=10) Pair a)
	{		
		assertThat (a.equals(a), equalTo(true));	
	}
	
	
	@Theory
	public void reflexividad(@RandomPair(n=20) Pair a, @RandomPair(n=20) Pair b)
	{	
		assumeTrue (a.equals(b));
		assertThat (b.equals(a), equalTo(true));	
	}
	
//********	
	@Theory
	public void transitividad(@RandomPair(n=2) Pair a,
							  @RandomPair(n=2) Pair b,
							  @RandomPair(n=2) Pair c)
	{
		System.out.println("-----------");
		System.out.println("a:" +a+", b: "+ b+", c: "+c);
		
		assumeTrue (a.equals(b));
		assumeTrue (b.equals(c));	
		System.out.println("paso");
		
		//System.out.println("a:" +a.hashCode()+", b: "+ b.hashCode()+", c: "+c.hashCode());
		assertThat (a.equals(c), equalTo(true));	
	}
	
	@Test 
	public void test() {
		Pair a = new Pair(6,3);
		Pair b = new Pair(4,2);
		Pair c = new Pair(3,5);
		
		assumeTrue(a.equals(b));
		assumeTrue(b.equals(c));
		assertThat (a.equals(c), equalTo(true));
	
	}
	
	@Theory
	public void equalNull(@RandomPair(n=10) Pair a)
	{		
		assertThat (a.equals(null), equalTo(false));	
	}
	
	//hashCode
}
