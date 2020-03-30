package PGL.pglp_4_2;

import java.util.LinkedList;

public class MoteurRPN extends Interpreteur{
	
	public LinkedList<Double> pile;
	public LinkedList<Action> actions;
	
	public LinkedList<EtatPile> historique;	
	public LinkedList<Boolean> historiqueOp;
	/**
	 * Constructeur
	 */
	public MoteurRPN() {
		pile = new LinkedList<Double>();
		historique = new LinkedList<EtatPile>();
		historiqueOp = new LinkedList<Boolean>();
		actions = new LinkedList<Action>();
	}
	
	
	/**
	 * Appliquer une operation
	 * @param oper operateur
	 */
	public void appliquerOperation(final Operation oper) throws Exception{
	
			double A= pile.getLast();
			pile.removeLast();

			double B= pile.getLast();
			pile.removeLast();

			double R;
			try {
				R = oper.eval(A,B);
					this.pile.addLast(R);
					EtatPile ep=new EtatPile(A,B);
					historique.addLast(ep);
			} catch (DivParZeroException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				this.pile.addLast(B);
				this.pile.addLast(A);
			}

	}
	/**
	 * Annulation de EVAL
	 */
    public void annulerEval() {
    	Boolean b= historiqueOp.getLast();
    	historiqueOp.removeLast();
        pile.removeLast();
    	if(b) {
            EtatPile P= historique.getLast();
            historique.removeLast();
            pile.addLast(P.getO2());
            pile.addLast(P.getO1());
    	}

       
    }
	/**
	 * Retourner les operandes
	 */
    public void ContenuActuel() {
        System.out.print("Affichage duContenu : [ ");
        for (Double d : pile) {
            System.out.print(" "+d + " | ");
        }
        System.out.print("] \n");
    }

}
