package partedos.ejercicio1;

import parteprimera.ejercicio4.Pizza;

public class Principal {

	public static void main(String[]args) {
		
		//creamos el objetto suna
		Suma Sumar = new Suma();
		
		//variables de tipo int
		int numeroUno = 33;
		int numeroDos = 13;
		
		//variables de tipo double
		double numeroUnoD = 3.3;
		double numeroDosD = 53.4;
		
		//llamamos a la clase para que sume y devuelva los resultados
		System.out.println("Usamos la funcion suma con enteroS :");
		System.out.println(Sumar.Suma(numeroUno,numeroDos));
		System.out.println("Usamos la funcion suma con doubles :");
		System.out.println(Sumar.Suma(numeroUnoD,numeroDosD));
	}
}
