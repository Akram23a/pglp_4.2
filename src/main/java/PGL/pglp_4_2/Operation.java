package PGL.pglp_4_2;
/**
 * @author Akram
 */
public enum Operation {
/**
	 *
	 */
	PLUS('+') {
		/**
		 * @param a val1
		 * @param b val 2
		 * @return resultat
		 */
		public double eval(final double a, final double b) {
			double r = a + b;
			return r;
		}
	},
	/**
	 *
	 */
	MOINS('-') {
		/**
		 * @param a val1.
		 * @param b val2.
		 * @return resultat
		 */
		public double eval(final double a, final double b) {
			double r = a - b;
			return r;
		}
	},
	/**
	 *
	 */
	MUL('*') {
		/**
		 * @param a val1.
		 * @param b val2.
		 * @return resultat
		 */
		public double eval(final double a, final double b) {
			double r = a * b;
			return r;
		}
	},
	/**
	 *
	 */
	DIV('/') {
		/**
		 * @param a val1.
		 * @param b val2.
		 * @return resultat.
		 * @throws DivParZeroException exception.
		 */
		public double eval(final double a, final double b)
				throws DivParZeroException {
			if (b != 0) {
				double r = a / b;
				return r; 
			} else {
	            throw new DivParZeroException();
			}
		}
	};
	/**
	 * @param ope1 operande1
	 * @param ope2 operande 2
	 * @return resultat
	 * @throws DivParZeroException exception
	 */
    public abstract double eval(double ope1, double ope2)
    		throws DivParZeroException;
    /**
     *
     */
    private char op;
    /**
     * @param o construire operation
     */
    Operation(final char o) {
        this.setSymbole(o);
    }
    /**
     * @return symbole
     */
    public final char getSymbole() {
    	return op;
    }
    /**
     * @param o nouvelle operation
     */
    public final void setSymbole(final char o) {
         op = o;
    }
 }
