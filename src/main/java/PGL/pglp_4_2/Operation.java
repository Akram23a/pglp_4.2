package PGL.pglp_4_2;

public enum Operation {
	PLUS('+')	{
		public double eval(final double a, final double b) {
			double r = a + b;
			return r; 
		}
	},
	MOINS('-')	{
		public double eval(final double a, final double b) {
			double r = a - b;
			return r; 
		}
	},
	MUL('*')	{
		public double eval(final double a, final double b) {
			double r = a * b;
			return r; 
		}
	},
	DIV('/')	{
		public double eval(final double a, final double b) throws DivParZeroException{
			if(b != 0) {
				double r = a / b;
				return r; 
			}
			else
	            throw new DivParZeroException();
		}
	};
	/**
	 * 
	 * @param ope1
	 * @param ope2
	 * @return
	 * @throws DivParZeroException
	 */
    public abstract double eval(double ope1, double ope2) throws DivParZeroException;
    private char op;
    /**
     * 
     * @param o
     */
    Operation(final char o) {
        this.setSymbole(o);
    }
    /**
     * 
     * @return
     */
    public char getSymbole() {
    	return op;
    }
    /**
     * 
     * @param o
     */
    public void setSymbole(final char o) {
         op = o;
    }
 }
