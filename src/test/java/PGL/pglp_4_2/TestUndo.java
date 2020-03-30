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
		S.getMoteur().getPile().addLast(20.0);
		S.getMoteur().getHistoriqueOp().add(false);
		S.getMoteur().getPile().addLast(30.0);
		S.getMoteur().getHistoriqueOp().add(false);
		S.getMoteur().getPile().addLast(40.0);
		S.getMoteur().getHistoriqueOp().add(false);
        S.getMoteur().appliquerOperation(Operation.PLUS);
		S.getMoteur().getHistoriqueOp().add(true);
		S.getMoteur().executerCommande("undo");
		assertTrue(40 == S.getMoteur().getPile().getLast());
    }
}