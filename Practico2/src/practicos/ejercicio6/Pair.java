package practicos.ejercicio6;


public class Pair {

	private int x; 
	private int y; 
	

	public Pair() {
		x = 0;
		y = 0;
	}


	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public void setX(int x) {
		this.x = x;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	
	/**
	 * Intercambia los valores del par.
	 */
	public void swap() {
		x = x * y;
		y = x / y;
		x = x / y;
	}

	
	/**
	 * Redefine metodo heredado de Object. Retorna una representación del objeto 
	 * corriente como String.
	 * @return String La representación del objeto corriente como String.
	 */
	@Override
	public String toString() {
		// TODO: implementar este metodo.
		return "( "+x+", "+y+" )";
	}

	
	
	/**
	 * Redefine metodo heredado de Object. Retorna true ssi el objeto corriente es igual
	 * al pasado como parametro.
	 * @param other es el objeto con el cual se compara el objeto corriente.
	 * @return true ssi el objeto corriente es igual a other.
	 */
	
	@Override
	public boolean equals(Object other) {
		// TODO: implementar este metodo.
		if(other == null){return false;}
		Pair p = (Pair)other;
		return (p.getX() == x && p.getY() == y );
	}


	
	
}
