package parte3.ejercicio1;

	public class Punto {
		private int x = 0;
		private int y = 0;
		
		/**
		 * Creamos un constructor con el nombre Punto
		 * @param x Sirve para guardar las coordenadas X
		 * @param y Sirve para guardar las coordenadas Y
		 */
		public Punto(int x, int y) {
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
	}