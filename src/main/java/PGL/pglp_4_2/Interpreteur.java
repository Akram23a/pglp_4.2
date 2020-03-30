package PGL.pglp_4_2;

import java.util.HashMap;

public class Interpreteur {
	
	private HashMap<String, Commande> commandes;
	/**
	 * 
	 */
	public Interpreteur() {
		setCommandes(new HashMap<String, Commande>());
	}
	/**
	 * 
	 * @param St
	 * @param cmd
	 */
	public void ajouterCommande(final String St, final Commande cmd) {
		commandes.put(St, cmd);
	}
	/**
	 * 
	 * @param cmd
	 */
	public void executerCommande(final String cmd) {
        Commande commande = commandes.get(cmd);
        commande.apply();

	}
	/**
	 * 
	 * @return
	 */
	public HashMap<String, Commande> getCommandes() {
		return commandes;
	}
	/**
	 * 
	 * @param commandes
	 */
	public void setCommandes(final HashMap<String, Commande> commandes) {
		this.commandes = commandes;
	}
}