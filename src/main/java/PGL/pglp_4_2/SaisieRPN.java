package PGL.pglp_4_2;

import java.util.Scanner;

public class SaisieRPN {

	public Scanner sc;
	public MoteurRPN moteur;
	public Action act;
	
	public Commande undo;
	public Commande quit;
	
	
	public SaisieRPN() {
        sc = new Scanner(System.in);
        moteur = new MoteurRPN();
        act = new Action();
        
        undo = new Undo(moteur, act);
        quit = new Quit(act);
        
        moteur.ajouterCommande("Undo", undo);
        moteur.ajouterCommande("Quit", quit);
	}
	
	public void interactions() throws Exception {

		while(sc.hasNext()) {
			
			if(sc.hasNext("quit")) {
				moteur.executerCommande("quit");
				break; 
			}else if(sc.hasNext("undo")) {
				moteur.executerCommande("undo");
			}else if(sc.hasNextInt()) {
				moteur.pile.push((double) sc.nextInt());
			}else {		
				Operation ope = null;

	            String str;
	            str = sc.next();
                switch(str.charAt(0)) {

                case '+':
                	ope = Operation.PLUS;
                case '-':
                	ope = Operation.MOINS;
                case '*':
                	ope = Operation.MUL;
                case '/':
                	ope = Operation.DIV;
                default:
                	break;
                }
                moteur.appliquerOperation(ope);
                moteur.ContenuActuel();

			}
			
			
		}
	}
}
