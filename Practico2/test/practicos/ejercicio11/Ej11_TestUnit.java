package practicos.ejercicio11;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class Ej11_TestUnit {
	
	private  SinglyLinkedList list;
	
	@Before
	public void setUp(){
		list = new SinglyLinkedList();

	  }	
	
	@Test
	public void testHeader() {
		Node node = new Node(3);
		list.setHeader(node);
		assertThat (list.getHeader(), equalTo(node));
		assertThat (list.getHeader().getValue(), equalTo(3));	
	}
	
	
	//******************************
	
		
	@Test
	public void testSize1() {
		list.setSize(5);
		assertThat (list.getSize(), equalTo(5));
	}
	
	@Test
	public void testSize2() {
		assertThat (list.getSize(), equalTo(0));
	}
	
	
	//******************************
	
		
	@Test
	public void testIsEmptyTrue() {
		assertThat (list.isEmpty(), equalTo(true));
	}
	
	@Test
	public void testIsEmptyFalse() {
		list.addFirst(3);		
		assertThat (list.isEmpty(), equalTo(false));
	}
	
	
	//******************************
	
	
	@Test
	public void testConstructorWithoutParams() {
		assertThat (list.isEmpty(), equalTo(true));
		assertThat (list.getSize(), equalTo(0));
	}
	
	@Test
	public void testConstructorWithParams() {
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		SinglyLinkedList auxList = new SinglyLinkedList(list);
		assertThat (list.toString(), equalTo(auxList.toString()));		
	}
	
	@Test
	public void testConstructorWithParams2() {
		SinglyLinkedList auxList = new SinglyLinkedList(list);
		assertThat (list.toString(), equalTo(auxList.toString()));		
	}
	
	
	//******************************
	
	
	@Test
	public void testAddFirst1() {
		list.addFirst(8);
		assertThat (list.getHeader().getNext().getValue(), equalTo(8));
		assertThat (list.getSize(), equalTo(1));
	}		
	
	
	@Test
	public void testAddFirst2() {
		list.addFirst(8);
		list.addFirst(3);
		assertThat (list.getHeader().getNext().getValue(), equalTo(3));
		assertThat (list.getSize(), equalTo(2));
	}		
	
	
	//******************************
	
	
	@Test
	public void testContains1() {
		list.addFirst(8);
		list.addFirst(4);
		list.addFirst(3);
		assertThat (list.contains(8), equalTo(true));
		assertThat (list.contains(4), equalTo(true));
		assertThat (list.contains(3), equalTo(true));
		assertThat (list.getSize(), equalTo(3));
	}	
			
	@Test
	public void testContains2() {
		list.addFirst(8);
		list.addFirst(4);
		list.addFirst(3);
		list.addFirst(7);
		assertThat (list.contains(2), equalTo(false));
		assertThat (list.getSize(), equalTo(4));
	}
	
	
	//******************************
	
	
	@Test
	public void testRemove1() {
		list.addFirst(8);
		list.remove(8);
		assertThat (list.contains(8), equalTo(false));
		assertThat (list.isEmpty(), equalTo(true));
		assertThat (list.getSize(), equalTo(0));
	}
	
	@Test
	public void testRemove2() {
		list.addFirst(8);
		list.addFirst(4);
		list.addFirst(3);
		list.remove(3);
		assertThat (list.getHeader().getNext().getValue(), equalTo(4));
		assertThat (list.contains(3), equalTo(false));
		assertThat (list.getSize(), equalTo(2));
	}	
	
	@Test
	public void testRemove3() {
		list.addFirst(8);
		list.addFirst(4);
		list.addFirst(3);
		list.remove(4);
		assertThat (list.contains(4), equalTo(false));
		assertThat (list.getSize(), equalTo(2));
	}		
	
	@Test
	public void testRemove4() {
		list.addFirst(8);
		list.addFirst(4);
		list.addFirst(3);
		list.remove(1);
		assertThat (list.contains(8), equalTo(true));
		assertThat (list.contains(4), equalTo(true));
		assertThat (list.contains(3), equalTo(true));
		assertThat (list.getSize(), equalTo(3));
	}
	
	
	//******************************
	
	
	@Test
	public void testToStringEmpty() {
		assertThat (list.toString(), equalTo("[]"));	
	}
	
	@Test
	public void testToString() {
		list.addFirst(8);
		list.addFirst(4);
		list.addFirst(3);
		assertThat (list.toString(), equalTo("[3,4,8]"));	
	}
	
}
