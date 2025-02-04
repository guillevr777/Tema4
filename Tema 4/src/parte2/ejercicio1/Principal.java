package parte2.ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		//variables para coordenadas x e y
		int x;
		int y;
		
		//asignamos valores a 
		x = 5;
		y = 0;
		
		//metodo de punto
		Punto numero1 = new Punto(x, y);
		
		//mostramos las cooredenadas
		System.out.println(numero1.x +  "," + numero1.y);
		
		//asignamos valores a 
		x = 10;
		y = 10;
		
		//metodo de punto
		Punto numero2 = new Punto(x, y);
				
		//mostramos las cooredenadas
		System.out.println(numero2.x +  "," + numero2.y);
		
		//asignamos valores a 
		x = -3;
		y = 7;
		
		//metodo de punto
		Punto numero3 = new Punto(x, y);
		
		//mostramos las cooredenadas
		System.out.println(numero3.x +  "," + numero3.y);

		System.out.println(numero1.x * numero3.x + "," + numero2.y + numero3.y);
	}
}
