package PGL.pglp_4_2;

public enum CalculatriceRPN {
Envirennement;
	
	public void run() throws Exception {
        SaisieRPN S = new SaisieRPN();
        try {
			S.interactions();
		} catch (RPNException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void main(String[] Args) throws Exception{
		Envirennement.run();
	}
}
