package PGL.pglp_4_2;
/**
 * @author Akram
 *
 */
public class EtatPile {
/**
 * o1.
 */
	private double o1;
	/**
	 * o2.
	 */
	private double o2;
	/**
	 * @param a op1
	 * @param b op2
	 */
	public EtatPile(final double a, final double b) {
		setO1(a);
		setO2(b);
	}
	/**
	 * @return o1
	 */
	public final double getO1() {
		return o1;
	}
	/**
	 * @param o operande
	 */
	public final void setO1(final double o) {
		this.o1 = o;
	}
	/**
	 * @return operande
	 */
	public final double getO2() {
		return o2;
	}
	/**
	 * @param o operande
	 */
	public final void setO2(final double o) {
		this.o2 = o;
	}
}
