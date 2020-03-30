package PGL.pglp_4_2;
/**
 * @author Akram
 */
public class Quit implements Commande {
    /**
     *
     */
	private Action act = new Action();
	/**
	 * @param action Action.
	 */
    public Quit(final Action action) {
        this.act = action;
    }
    /**
     * Appliquer.
     */
    public final void apply() {
        act.actionQuit();
    }
}
