package PGL.pglp_4_2;

import java.util.Scanner;
/**
 * @author Akram
 */
public class SaisieRPN {
	/**
	 * Attribus
	 */
	private Scanner sc;
	/**
	 *
	 */
	private MoteurRPN moteur;
	/**
	 *
	 */
	private Action act;
	/**
	 *
	 */
	private Commande undo;
	/**
	 *
	 */
	private Commande quit;
	/**
	 *
	 */
	private String ss;
	/**
	 * Saisie.
	 */
	public SaisieRPN() {
        sc = new Scanner(System.in);
        moteur = new MoteurRPN();
        act = new Action();
        undo = new Undo(moteur, act);
        quit = new Quit(act);
        moteur.ajouterCommande("undo", undo);
        moteur.ajouterCommande("quit", quit);
	}
	/**
	 * @throws Exception exceptions.
	 */
	public final void interactions() throws Exception {
		while (sc.hasNext()) {
			if (sc.hasNext("quit")) {
				moteur.executerCommande("quit");
				break;
			} else if (sc.hasNext("undo")) {
				moteur.executerCommande("undo");
				ss = "";
                ss = sc.next();
			} else if (sc.hasNextDouble()) {
				moteur.getPile().addLast(sc.nextDouble());
				moteur.getHistoriqueOp().add(false);
			} else {
				Operation ope = null;
	            char str;
	            str = sc.next().charAt(0);

                switch (str) {
                case '+':
                	ope = Operation.PLUS;
                	break;
                case '-':
                	ope = Operation.MOINS;
                	break;
                case '*':
                	ope = Operation.MUL;
                	break;
                case '/':
                	ope = Operation.DIV;
                	break;
                default:
                	break;
                }
				moteur.getHistoriqueOp().add(true);
                moteur.appliquerOperation(ope);
			}
            moteur.contenuActuel();
		}
	}
	/**
	 * @return moteur
	 */
	public final MoteurRPN getMoteur() {
		return moteur;
	}
}
