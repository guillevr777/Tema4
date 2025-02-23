package partetres.ejercicio5;

import java.util.Random;

public class NumerosAleatorios {

	public static void numerosAleatorios (int numero) {
		
		//llamamos al metodo random
		Random random = new Random();
		
		//numero de iteraciones
		int numeroRepeticiones = numero;
		
		//numero generado con random
		int numeroRandom;
		
		//bucle de tipo while que se repetira el mismo numero de veces que la variable numero
		while (numeroRepeticiones > 0) {
			numeroRandom = random.nextInt(0,2);
			System.out.print(numeroRandom + "\t");
			numeroRepeticiones--;
		}
	}
	public static void numerosAleatorios (int numero, int numeroDos) {
		
		//llamamos al metodo random
		Random random = new Random();
		
		//numero de iteraciones
		int numeroRepeticiones = numero;
		
		//numero generado con random
		int numeroRandom;
		
		//bucle de tipo while que se repetira el mismo numero de veces que la variable numero
		while (numeroRepeticiones > 0) {
			numeroRandom = random.nextInt(0,numeroDos);
			System.out.print(numeroRandom + "\t");
			numeroRepeticiones--;
		}
	}
	public static void numerosAleatorios (int numero, int numeroDos, int numeroTres) {
		
		//llamamos al metodo random
		Random random = new Random();
		
		//numero de iteraciones
		int numeroRepeticiones = numero;
		
		//numero generado con random
		int numeroRandom;
		
		//bucle de tipo while que se repetira el mismo numero de veces que la variable numero
		while (numeroRepeticiones > 0) {
			numeroRandom = random.nextInt(numeroTres,numeroDos);
			System.out.print(numeroRandom + "\t");
			numeroRepeticiones--;
		}
	}
}
