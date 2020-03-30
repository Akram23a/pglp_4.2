package PGL.pglp_4_2;
/**
 *
 */
import java.util.HashMap;
/**
 * @author Akram
 */
public class Interpreteur {
	/**
	 * Commandes
	 */
	private HashMap<String, Commande> commandes;
	/**
	 * Interpreteur const
	 */
	public Interpreteur() {
		setCommandes(new HashMap<String, Commande>());
	}
	/**
	 * @param st string
	 * @param cmd commande
	 */
	public final void ajouterCommande(final String st, final Commande cmd) {
		commandes.put(st, cmd);
	}
	/**
	 * @param cmd commande
	 */
	public final void executerCommande(final String cmd) {
        Commande commande = commandes.get(cmd);
        commande.apply();

	}
	/**
	 * @return commande
	 */
	public final HashMap<String, Commande> getCommandes() {
		return commandes;
	}
	/**
	 * @param cmds commandes
	 */
	public final void setCommandes(final HashMap<String, Commande> cmds) {
		this.commandes = cmds;
	}
}
