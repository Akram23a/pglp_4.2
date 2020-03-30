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
}
