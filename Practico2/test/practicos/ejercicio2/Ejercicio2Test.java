package practicos.ejercicio2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import practicos.ejercicio2.Minefield;

public class Ejercicio2Test {

	private Minefield fieldAux;
	      
	@Before
	public void setUp(){
		fieldAux = new Minefield();
	    fieldAux.putMine(0,0);
	    fieldAux.putMine(0,1);
	    fieldAux.putMine(0,2);
	    fieldAux.putMine(1,0);
	    fieldAux.putMine(1,1);
	    fieldAux.putMine(1,2);
	    fieldAux.putMine(2,0);
	    fieldAux.putMine(2,1);
	    fieldAux.putMine(2,2);
	    fieldAux.putMine(7,7);
	  }	

	@Test
    /*
     * [+][*][ ]
     * [*][*][ ]
     * [ ][ ][ ]
     */
    public void minedNeighboursTest1(){
      assertEquals(3,fieldAux.minedNeighbours(0,0));
    }
    
    @Test
    /*
     * [*][+][*]
     * [*][*][*]
     * [ ][ ][ ]
     */
    public void minedNeighboursTest2(){
      assertEquals(5,fieldAux.minedNeighbours(0,1));
    }
    
    @Test
    /*
     * [ ][*][+]
     * [ ][*][*]
     * [ ][ ][ ]
     */
    public void minedNeighboursTest3(){
      assertEquals(3,fieldAux.minedNeighbours(0,2));
    }
    
    @Test
    /*
     * [*][*][ ]
     * [+][*][ ]
     * [*][*][ ]
     */
    public void minedNeighboursTest4(){
      assertEquals(5,fieldAux.minedNeighbours(1,0));
    }
    
    @Test
    /*
     * [*][*][*]
     * [*][+][*]
     * [*][*][*]
     */
    public void minedNeighboursTest5(){
      assertEquals(8,fieldAux.minedNeighbours(1,1));
    }
    
    @Test
    /*
     * [ ][*][*]
     * [ ][*][+]
     * [ ][*][*]
     */
    public void minedNeighboursTest6(){
      assertEquals(5,fieldAux.minedNeighbours(1,2));
    }
    
    @Test
    /*
     * [ ][ ][ ]
     * [*][*][ ]
     * [+][*][ ]
     */
    public void minedNeighboursTest7(){
      assertEquals(3,fieldAux.minedNeighbours(2,0));
    }
    
    @Test
    /*
     * [ ][ ][ ]
     * [*][*][*]
     * [*][+][*]
     */
    public void minedNeighboursTest8(){
      assertEquals(5,fieldAux.minedNeighbours(2,1));
    }
    
    @Test
    /*
     * [ ][ ][ ]
     * [ ][*][*]
     * [ ][*][+]
     */
    public void minedNeighboursTest9(){
      assertEquals(3,fieldAux.minedNeighbours(2,2));
    }
    
    @Test
    /*
     * [ ][ ][ ]
     * [ ][ ][ ]
     * [ ][ ][+]
     */
    public void minedNeighboursTest10(){
      assertEquals(0,fieldAux.minedNeighbours(7,7));
    }
    
    @Test(expected=IllegalArgumentException.class)
    /*
     * [ ][ ][ ]
     * [ ][ ][ ]
     * [ ][ ][ ]
     */
    public void minedNeighboursTest11(){
      fieldAux.minedNeighbours(30,10);
    }
}
