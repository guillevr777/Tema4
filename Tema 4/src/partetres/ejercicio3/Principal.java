package partetres.ejercicio3;

import partetres.ejercicio3.SumaEnteros;

public class Principal {

	public static void main(String[] args) {

		// Creamos un objeto de la clase Suma
				SumaEnteros suma = new SumaEnteros();

				// Variables de tipo entero 
				int numeroUno = 32;
				int numeroDos = 10;
				
				// Llamamos a la clase Media
				System.out.println("Devolvemos la suma de enteros :");
				System.out.println(suma.SumaEnteros(numeroUno));
				System.out.println(suma.SumaEnteros(numeroUno, numeroDos));
	}

}
