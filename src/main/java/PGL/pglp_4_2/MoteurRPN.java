package PGL.pglp_4_2;

import java.util.LinkedList;
/**
 * 
 * @author Akram.
 *
 */
public class MoteurRPN extends Interpreteur {
	public LinkedList<Double> pile;
	/**
	 *
	 */
	public LinkedList<Action> actions;
	/**
	 *
	 */
	public LinkedList<EtatPile> historique;
	/**
	 *
	 */
	public LinkedList<Boolean> historiqueOp;
	/**
	 * Constructeur.
	 */
	public MoteurRPN() {
		pile = new LinkedList<Double>();
		historique = new LinkedList<EtatPile>();
		historiqueOp = new LinkedList<Boolean>();
		actions = new LinkedList<Action>();
	}
	/**
	 * Appliquer une operation.
	 * @param oper operateur.
	 */
	final public void appliquerOperation(final Operation oper) 
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
						EtatPile ep = new EtatPile(a, b);
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
    public void annulerEval() {
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
    final public void contenuActuel() {
        System.out.print("Affichage duContenu : [ ");
        for (Double d : pile) {
            System.out.print(" " + d + " | ");
        }
        System.out.print("] \n");
    }
}