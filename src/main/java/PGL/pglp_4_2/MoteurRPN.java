package PGL.pglp_4_2;

import java.util.LinkedList;

public class MoteurRPN extends Interpreteur{
	
	public LinkedList<Double> pile;
	
	public MoteurRPN() {
		pile = new LinkedList<Double>();
	}

	public void empilerInt(final double number) {
		pile.push(number);
	}
	
	public void appliquerOperation(final Operation oper) {
		double A= pile.pop();
		double B= pile.pop();
		double R = oper.eval(A,B);
		this.empilerInt(R);
	}
}
