package PGL.pglp_4_2;
/**
 * @author Akram
 */
public class MinDeuxException extends RPNException {
/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *
	 */
	public MinDeuxException() {
		super("Il manque un numero pour pouvoir"
				+ " effectuer cette operation");
	}
}
