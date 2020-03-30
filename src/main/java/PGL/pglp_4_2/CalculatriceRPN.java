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
	 * @throws Exception.
	 */
	public void run() throws Exception {
		SaisieRPN S = new SaisieRPN();
		S.interactions();
	}
	/**
	 * @param args Args.
	 * @throws Exception Excep.
	 */
	public static void main(String[] args) throws Exception{
		Envirennement.run();
	}
}
