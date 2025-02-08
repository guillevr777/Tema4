package parte4.ejercicio3;

public class Rectangulo {
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	
	/**
	 * Creamos el constraint llamado rectangulo
	 * @param x1 Guarda coordenada x1
	 * @param x2 Guarda coordenada x2
	 * @param y1 Guarda coordenada y1
	 * @param y2 Guarda coordenada y2
	 */
	public Rectangulo (int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	public int getX1() {
		return x1;
	}

	public void setX1y1(int x1 ,int y1) {
		this.x1 = x1;
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2y2(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getY1() {
		return y1;
	}

	public int getY2() {
		return y2;
	}
	
	public void setAll(int x1 ,int y1 ,int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
		this.x1 = x1;
		this.y1 = y1;
	}
	
	 public int getBase() {
	   return Math.abs(x2 - x1);
	}
	 
	public int getAltura() {
	   return Math.abs(y2 - y1);
	}
	
	public int getPerimetro() {
		return 2 * (getBase() + getAltura());
	}
	
	public int getArea() {
		return getBase() * getAltura();
	}
	
	public String toString() {
		return "Rectángulo [(" + x1 + ", " + y1 + ") , (" + x2 + ", " + y2 + ")] " + "Base: " + getBase() + ", Altura: " + getAltura() + ", Perímetro: " + getPerimetro() + ", Área: " + getArea();
	}
}
