package PGL.pglp_4_2;
/**
 * @author Akram
 */
public class DivParZeroException extends RPNException{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *
	 */
    public DivParZeroException() {
        super("Impossible de diviser par 0");
    }
}