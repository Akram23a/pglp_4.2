package PGL.pglp_4_2;

public class Undo implements Commande {
	private Action act;
	private MoteurRPN mot;
	
	public Undo(final MoteurRPN m, final Action a) {
		setMot(m);
		act = a;
	}
	
	
	public void apply() {
		mot.annulerEval();
		act.actionUndo();
	}


	public MoteurRPN getMot() {
		return mot;
	}


	public void setMot(MoteurRPN mot) {
		this.mot = mot;
	}

}
