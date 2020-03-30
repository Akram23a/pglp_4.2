package PGL.pglp_4_2;
/**
 * @author Akram
 */
public enum CalculatriceRPN {
/**
 *
 */
Envirennement;
	/**
	 * @throws Exception
	 */
	public void run() throws Exception {
		SaisieRPN s = new SaisieRPN();
		s.interactions();
	}
	/**
	 * @param args Args.
	 * @throws Exception Excep.
	 */
	public static void main(final String[] args) throws Exception {
		Envirennement.run();
	}
}
