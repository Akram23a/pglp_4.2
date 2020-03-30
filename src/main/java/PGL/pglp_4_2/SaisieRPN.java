package PGL.pglp_4_2;

import java.util.Scanner;

public class SaisieRPN {

	public Scanner sc;
	public MoteurRPN moteur;
	public Action act;
	
	public SaisieRPN() {
        sc = new Scanner(System.in);
        moteur = new MoteurRPN();
        act = new Action();
        

	}
}
