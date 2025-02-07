package parte4.ejercicio1;

import java.util.Scanner;

import parte4.ejercicio1.Punto;

	public class Principal {

		public static void main(String[] args) {
		
			//llamamos al escaner
			Scanner reader = new Scanner(System.in);
				
			//variables para coordenadas x e y
			int x = 0;
			int y = 0;
				
			//creamos el metodo
			Punto numero1 = new Punto(5, 0);
				
			//metodo de punto
			Punto numero3 = new Punto(10, 10);
				
			//metodo de punto
			Punto numero2 = new Punto(-3, 7);
				
			//mostramos las cooredenadas
			System.out.println(numero1.getX() +  "," + numero1.getY());
					
			//mostramos las cooredenadas
			System.out.println(numero2.getX() +  "," + numero2.getY());
				
			//mostramos las cooredenadas
			System.out.println(numero3.getX() +  "," + numero3.getY());
			
			System.out.println("Que valor quieres darle a X e Y?");
			x = reader.nextInt();
			y = reader.nextInt();
				
			//asignamos valores a 
			numero1.setXY(x, y);
			
			//mostramos las cooredenadas
			System.out.println(numero1.getX() +  "," + numero1.getY());
			
			System.out.println("Cuanto quieres desplazar ambos puntos?");
			x = reader.nextInt();
			y = reader.nextInt();
			
			numero1.desplaza(x, y);
			
			//mostramos las cooredenadas
			System.out.println(numero1.getX() +  "," + numero1.getY());
			
			//explicamos la distacia entre los dos objetos
			System.out.println("Espacio entre la persona 1 y la 2 :");
			
			//mostramos la distancia entre ambos
			System.out.println(numero1.distancia(numero2));
				
			//mostramos las cooredenadas
			System.out.println(numero1.getX() +  "," + numero1.getY());
			
			//mostramos las coordenadas to string
			System.out.println(numero1.toString());	
			
			System.out.println(numero1.getX() * numero3.getX() + "," + numero2.getY() + numero3.getY());
	}
}
