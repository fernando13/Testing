package practicos.ejercicio4;

import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

import practicos.ejercicio4.Ejercicio4;

public class Ejercicio4Test {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test(expected = NullPointerException.class)
	public void nullListTest() {
		List list = null;
		Ejercicio4.largest(list);
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test(expected = IndexOutOfBoundsException.class)
	public void EmptyListTest() {
		List list = new LinkedList();
		Ejercicio4.largest(list);
	}

	
	@Test
	public void SoloElementListTest() {
		List<Integer> list = new LinkedList<Integer>();
		list.add(2); 
		assertTrue(2 == (int)Ejercicio4.largest(list));
	}
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test(expected = ClassCastException.class)
	public void testMutuallyIncomparable()
	{
		List list = new LinkedList();
		list.add("cat");
		list.add("dog");
		list.add(1);
		Ejercicio4.largest(list);
		fail();
	}
	
	
	@Test
	public void IntegerListTest() {
		List<Integer> list = new LinkedList<Integer>();
		list.add(2); 
		list.add(3); 
		list.add(6); 
		list.add(1);
		assertTrue(6 == (int)Ejercicio4.largest(list));
	}
	
	
	@Test
	public void StringListTest() {
		List<String> list = new LinkedList<String>();
		list.add("gato"); 
		list.add("perro"); 
		list.add("edificio");
		assertTrue("perro" == Ejercicio4.largest(list));
	}	
}
