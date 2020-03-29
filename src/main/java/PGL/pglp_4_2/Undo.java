package PGL.pglp_4_2;

public class Undo implements Commande {
	private Action act;

	
	public void apply() {
		// TODO Auto-generated method stub
		act.actionUndo();
	}

}
