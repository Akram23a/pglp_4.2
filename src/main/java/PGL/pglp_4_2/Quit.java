package PGL.pglp_4_2;

public class Quit implements Commande{
    
	private Action act = new Action();

    
    public void QuitCom(final Action action){
        this.act = action;
    }

    public void apply() {
        act.actionQuit();
    }
}
