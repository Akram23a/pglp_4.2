package PGL.pglp_4_2;

public enum CalculatriceRPN {

	Envirennement;
	/**
	 * 
	 * @throws Exception
	 */
	public void run() throws Exception {
		SaisieRPN S = new SaisieRPN();
		S.interactions();
	}
	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
		Envirennement.run();
	}
}
