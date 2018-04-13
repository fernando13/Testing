package teoria2;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;


import static org.junit.Assert.*;
import java.util.*;

@RunWith (Parameterized.class)
public class DataDrivenCalcTest2
{
	@Parameter(value=0)
	public int a; 
	@Parameter(value=1)
	public int b; 
	@Parameter(value=2)
	public int sum;

	@Parameters(name = "{index}: sum({0},{1})= {2}")
	public static Collection<Object[]> calcValues()
	{
		return Arrays.asList (new Object [][] {{1, 1, 2}, {2, 3, 5}}); 
	}

	@Test
	public void additionTest()
	{
		assertTrue ("Addition Test", sum == Calc.add(a,b));
	}
}
