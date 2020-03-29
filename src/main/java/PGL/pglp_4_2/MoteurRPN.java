package PGL.pglp_4_2;

import java.util.LinkedList;

public class MoteurRPN extends Interpreteur{
	
	public LinkedList<Double> pile;
	
	/**
	 * Constructeur
	 */
	public MoteurRPN() {
		pile = new LinkedList<Double>();
	}
	
	/**
	 * 
	 * @param number num a empiler
	 */
	public void empilerInt(final double number) {
		pile.push(number);
	}
	
	/**
	 * Appliquer une operation
	 * @param oper operateur
	 */
	public void appliquerOperation(final Operation oper) {
		double A= pile.pop();
		double B= pile.pop();
		double R = oper.eval(A,B);
		this.empilerInt(R);
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
