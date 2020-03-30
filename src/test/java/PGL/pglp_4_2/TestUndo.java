package PGL.pglp_4_2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestUndo {
	/**
	 * 
	 * @throws Exception
	 */
	@Test
    public void undoTest() throws Exception {
    	
    	SaisieRPN S=new SaisieRPN();
		S.moteur.pile.addLast(20.0);
		S.moteur.historiqueOp.add(false);
		S.moteur.pile.addLast(30.0);
		S.moteur.historiqueOp.add(false);
		S.moteur.pile.addLast(40.0);
		S.moteur.historiqueOp.add(false);
        S.moteur.appliquerOperation(Operation.PLUS);
		S.moteur.historiqueOp.add(true);
		S.moteur.executerCommande("undo");
		assertTrue(40 == S.moteur.pile.getLast());
    }
}