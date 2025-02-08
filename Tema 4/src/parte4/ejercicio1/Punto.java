package parte4.ejercicio1;

public class Punto {
	private int x = 0;
	private int y = 0;
	private int dx = 0;
	private int dy = 0;

	/**
	 * Creamos un constructor con el nombre Punto
	 * 
	 * @param x Sirve para guardar las coordenadas X
	 * @param y Sirve para guardar las coordenadas Y
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;

	}

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public void setXY(int x, int y) {
		if (x < 0 && y < 0) {
			this.x = x;
			this.y = y;
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void desplaza(int dx, int dy) {
		this.x = dx;
		this.y = dy;
	}

	public double distancia(Punto p) {
	    return Math.sqrt(Math.pow((p.getX() - this.x), 2) + Math.pow((p.getY() - this.y), 2));
	}


	 @Override
	public String toString() {
	    return "(" + x + ", " + y + ")";
	}
}