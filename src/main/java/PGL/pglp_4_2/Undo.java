package PGL.pglp_4_2;
/**
 * @author Akram
 */
public class Undo implements Commande {
	/**
	 *
	 */
	private Action act;
	private MoteurRPN mot;
	/**
	 * @param m moteur
	 * @param a action
	 */
	public Undo(final MoteurRPN m, final Action a) {
		setMot(m);
		act = a;
	}
	/**
	 *
	 */
	public final void apply() {
        if (!mot.pile.isEmpty()) {
        	mot.annulerEval();
        }
		act.actionUndo();
	}
	/**
	 * @return moteur
	 */
	public final MoteurRPN getMot() {
		return mot;
	}
	/**
	 *
	 * @param mo moteur
	 */
	public final void setMot(final MoteurRPN mo) {
		this.mot = mo;
	}
}
