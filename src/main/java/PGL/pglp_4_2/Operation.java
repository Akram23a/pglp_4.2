package PGL.pglp_4_2;

public enum Operation {

	PLUS('+')	{
		@SuppressWarnings("unused")
		public int eval(final int a, final int b) {
			return a + b; 
		}
	},
	MOINS('-')	{
		@SuppressWarnings("unused")
		public int eval(final int a, final int b) {
			return a - b; 
		}
	},
	MUL('*')	{
		@SuppressWarnings("unused")
		public int eval(final int a, final int b) {
			return a * b; 
		}
	},
	DIV('\\')	{
		@SuppressWarnings("unused")
		public int eval(final int a, final int b) {
			if(b != 0)
				return a + b; 
			else
				return 0;
		}
	};
	
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

