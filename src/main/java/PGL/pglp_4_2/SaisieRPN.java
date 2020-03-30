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
        
        moteur.ajouterCommande("undo", undo);
        moteur.ajouterCommande("quit", quit);
	}
	
	public void interactions() throws Exception {
		String ss="";
		while(sc.hasNext()) {
			
			if(sc.hasNext("quit")) {
				moteur.executerCommande("quit");
				break; 
			}else if(sc.hasNext("undo")) {
				moteur.executerCommande("undo");
                ss=sc.next();
			}else if(sc.hasNextDouble()) {
				moteur.pile.addLast(sc.nextDouble());
				moteur.historiqueOp.add(false);
			}else {		
				Operation ope = null;

	            char str;
	            str = sc.next().charAt(0);

                switch(str) {

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
				moteur.historiqueOp.add(true);
                moteur.appliquerOperation(ope);
			}
			
            moteur.ContenuActuel();

		}
	}
}
