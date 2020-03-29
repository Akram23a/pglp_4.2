package PGL.pglp_4_2;

import java.util.LinkedList;

public class MoteurRPN extends Interpreteur{
	
	public LinkedList<Double> pile;
	public LinkedList<EtatPile> historique;	
	/**
	 * Constructeur
	 */
	public MoteurRPN() {
		pile = new LinkedList<Double>();
		historique = new LinkedList<EtatPile>();
	}
	
	
	/**
	 * Appliquer une operation
	 * @param oper operateur
	 */
	public void appliquerOperation(final Operation oper) throws Exception{
		if(pile.get(pile.size()) >= 2)
		{
			double A= pile.pop();
			double B= pile.pop();
			double R;
			try {
				R = oper.eval(A,B);
				if ( B!= 0) {
					this.pile.push(R);
					EtatPile ep=new EtatPile(A,B);
					historique.push(ep);
				}
			} catch (DivParZeroException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				this.pile.push(B);
				this.pile.push(A);
			}
		}else {
			throw new MinDeuxException();
		}
	}
	/**
	 * Annulation de EVAL
	 */
    public void annulerEval() {
        this.pile.removeLast();
        this.pile.add(historique.getLast().getO1());
        this.pile.add(historique.getLast().getO2());
        this.historique.removeLast();
    }

	
	/**
	 * Retourner les operandes
	 */
    public void ContenuActuel() {
        System.out.print("Affichage duContenu : [");
        for (Double d : pile) {
            System.out.print(" "+d + "=>");
        }
        System.out.print("] \n");
    }

}
