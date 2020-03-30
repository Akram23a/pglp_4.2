package PGL.pglp_4_2;

import java.util.LinkedList;
/**
 * @author Akram
 */
public class MoteurRPN extends Interpreteur {
/**
	 *
	 */
	private LinkedList<Double> pile;
	/**
	 *
	 */
	private LinkedList<Action> actions;
	/**
	 *
	 */
	private LinkedList<EtatPile> historique;
	/**
	 *
	 */
	private LinkedList<Boolean> historiqueOp;
	/**
	 * Constructeur.
	 */
	public MoteurRPN() {
		pile = new LinkedList<Double>();
		historique = new LinkedList<EtatPile>();
		historiqueOp = new LinkedList<Boolean>();
		setActions(new LinkedList<Action>());
	}
	/**
	 * Appliquer une operation.
	 * @param oper operateur.
	 */
	public final void appliquerOperation(final Operation oper) 
			throws Exception {
			if (pile.size() >= 2) {
				double a = pile.getLast();
				pile.removeLast();
				double b = pile.getLast();
				pile.removeLast();
				double r;
				try {
					r = oper.eval(a, b);
						this.pile.addLast(r);
						EtatPile ep = 
								new EtatPile(a, b);
						historique.addLast(ep);
				} catch (DivParZeroException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					this.pile.addLast(b);
					this.pile.addLast(a);
				}
			} else {
				throw new MinDeuxException();
			}
	}
	/**
	 * Annulation de EVAL.
	 */
    public final void annulerEval() {
    	Boolean b = historiqueOp.getLast();
    	historiqueOp.removeLast();
        pile.removeLast();
    	if (b) {
            EtatPile p = historique.getLast();
            historique.removeLast();
            pile.addLast(p.getO2());
            pile.addLast(p.getO1());
    	}
    }
	/**
	 * Retourner les operandes.
	 */
    public final void contenuActuel() {
        System.out.print("Affichage duContenu : [ ");
        for (Double d : pile) {
            System.out.print(" " + d + " | ");
        }
        System.out.print("] \n");
    }
    /**
     * @return action
     */
	public final LinkedList<Action> getActions() {
		return actions;
	}
	/**
	 * @param actions acts
	 */
	public final void setActions(final LinkedList<Action> actions) {
		this.actions = actions;
	}
	/**
	 * @param p pile
	 */
	public final void setPile(final LinkedList<Double> p) {
		pile = p;
	}
	/**
	 * @return pile
	 */
	public final LinkedList<Double> getPile(){
		return pile;
	}
	/**
	 * @return historique
	 */
	public final LinkedList<EtatPile> getHistoeique() {
		return historique;
	}
	/**
	 * @param p historique
	 */
	public final void setHistorique(final LinkedList<EtatPile> p) {
		historique = p;
	}
	/**
	 * @return his
	 */
	public final LinkedList<Boolean> getHistoriqueOp() {
		return historiqueOp;
	}
	/**
	 * @param p hisOp
	 */
	public final void setHistoriqueOp(final LinkedList<Boolean> p) {
		historiqueOp = p;
	}

}
