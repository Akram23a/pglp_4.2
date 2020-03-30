package PGL.pglp_4_2;

public enum CalculatriceRPN {

	Envirennement;
	
	public void run() throws Exception {
		
		SaisieRPN S = new SaisieRPN();
		S.interactions();

	}
	
	public static void main(String[] args) throws Exception{
		Envirennement.run();
	}
}
