package practicos.ejercicio11;


import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assume.assumeFalse;

@RunWith (Theories.class)
public class Ej11_TestTheory {
	
	@Theory
	public void addRemoveThenEqualList(@RandomList(n=10) SinglyLinkedList list) 
	{
		assumeFalse(list.contains(5));							// Assume	
		SinglyLinkedList aux = new SinglyLinkedList(list);			
		
		list.addFirst(5);
		list.remove(5);
		
		assertThat(list.toString(), equalTo(aux.toString()));	// Assert
	}
	
	
	@Theory
	public void addElemThenSizeInc(@RandomList(n=10) SinglyLinkedList list) 
	{
		int size = list.getSize();
		list.addFirst(2);
		
		assertThat(list.getSize(), equalTo(size+1));	// Assert
	}
	
	
	@Theory
	public void removeAllThenEmptyList(@RandomList(n=10) SinglyLinkedList list) 
	{
		//System.out.println("\nLista: "+list+" Long: "+list.getSize());
		
		int size = list.getSize();
		for (int i = 0; i < size; i++) {

			list.remove(list.getHeader().getNext().getValue());
			//System.out.println(list);
		}	
		assertThat(list.isEmpty(), equalTo(true));	// Assert
	}	
}
