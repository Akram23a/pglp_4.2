package PGL.pglp_4_2;

import java.util.LinkedList;

public class MoteurRPN extends Interpreteur{
	
	public LinkedList<Integer> pile;
	
	public MoteurRPN() {
		pile = new LinkedList<Integer>();
	}

	public void empilerInt(final int number) {
		pile.push(number);
	}
	
}
