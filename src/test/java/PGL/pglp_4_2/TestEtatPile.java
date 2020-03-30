package PGL.pglp_4_2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestEtatPile {
	
	 public EtatPile E;
	 /**
	  * 
	  */
	 @Test
	 public void testEtatPile() {
		 
	        E = new EtatPile(1, 2);
	        double o1 = 1;
	        double o2 = 2;
	        assertTrue(o1 == E.getO1());
	        assertTrue(o2 == E.getO2());
	    }
}
