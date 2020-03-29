package PGL.pglp_4_2;

public class EtatPile {
	
	private double o1;
	private double o2;
	
	public EtatPile(final double a, final double b) {
		setO1(a);
		setO2(b);
	}

	public double getO1() {
		return o1;
	}

	public void setO1(double o1) {
		this.o1 = o1;
	}

	public double getO2() {
		return o2;
	}

	public void setO2(double o2) {
		this.o2 = o2;
	}
}
