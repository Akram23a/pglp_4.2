package PGL.pglp_4_2;

public class Undo implements Commande {
	
	private Action act;
	private MoteurRPN mot;
	
	/**
	 * 
	 * @param m
	 * @param a
	 */
	public Undo(final MoteurRPN m, final Action a) {
		setMot(m);
		act = a;
	}
	
	/**
	 * 
	 */
	public void apply() {
        if (!mot.pile.isEmpty()) {
        	mot.annulerEval();
        }
		act.actionUndo();
	}

	/**
	 * 
	 * @return
	 */
	public MoteurRPN getMot() {
		return mot;
	}

	/**
	 * 
	 * @param mot
	 */
	public void setMot(MoteurRPN mot) {
		this.mot = mot;
	}
}
