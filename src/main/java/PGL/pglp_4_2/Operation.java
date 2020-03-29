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
	DIV('\\')	{
		public double eval(final double a, final double b) {
			if(b != 0) {
				double r = a + b;
				return r; 
			}
			else
				return 0;
		}
	};
    public abstract double eval(double ope1, double ope2);

    private char op;
    
    Operation(final char o) {
        this.setSymbole(o);
    }
        public char getSymbole() {
            return op;
        }
    
        public void setSymbole(final char o) {
            this.op = o;
        }

 }

