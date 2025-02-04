package parte2.ejercicio3;

public class Principal {

	public static void main(String[] args) {
		
		//creamos variables para guardar los valores temporalmente
		int x1;
		int x2;
		int y1;
		int y2;
		
		//asignamos valores a pieza 2
		x1 = 0;
		y1 = 0;
		x2 = 5;
		y2 = 5;
		
		//llamamos a la clase rectangulo
		Rectangulo pieza1 = new Rectangulo(x1, x2, y1, y2);

		//asignamos valores a pieza 2
		x1 = 7;
		y1 = 9;
		x2 = 2;
		y2 = 3;
		
		//llamamos a la clase rectangulo
		Rectangulo pieza2 = new Rectangulo(x1, x2, y1, y2);
		
		//mostramos el perimetro y el area de la primera pieza
		System.out.println("El perimetro de la primera pieza sera " + (int)(pieza1.x1 + pieza1.y1) + " y su area sera " + pieza1.x2 * pieza1.y2);
	
		//mostramos el perimetro y el area de la segunda pieza
		System.out.println("El perimetro de la segunda pieza sera " + pieza2.x1 + pieza2.y1 + " y su area sera " + pieza2.x2 * pieza2.y2);

		//asignamos valores a pieza 2
		pieza1.x1 = 2;
		pieza1.y1 = 4;
		pieza1.x2 = 2;
		pieza1.y2 = 6;
				
		//mostramos el perimetro y el area de la primera pieza modificados
				System.out.println("El perimetro de la primera pieza sera " + pieza1.x1 + pieza1.y1 + " y su area sera " + pieza1.x2 * pieza1.y2 + " si lo modificamos.");
	}
}
