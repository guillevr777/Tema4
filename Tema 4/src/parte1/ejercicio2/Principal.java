package parte1.ejercicio2;

import java.util.Scanner;

import parte1.ejercicio2.Persona;

public class Principal {

	public static void main(String[] args) {
		
		//llamaos a la clase Scanner
		Scanner reader = new Scanner(System.in);
		
		//llamamos a la clase persona
		Persona persona1 = new Persona();
		
		//llamamos a la clase persona
		Persona persona2 = new Persona();

		//creamos variable i
		int i = 0;
		
		//variable de tipo string
		String edad1;
		String edad2;
		
		//preguntamos por valor a asignar a las personas
			System.out.println("Dime un nombre, dni , apellido y edad :");
			persona1.nombre = reader.next();
			persona1.dni = reader.next();
			persona1.apellido = reader.next();
			persona1.edad = reader.nextInt();
			
			System.out.println("Dime otro nombre, dni , apellido y edad :");
			persona2.nombre = reader.next();
			persona2.dni = reader.next();
			persona2.apellido = reader.next();
			persona2.edad = reader.nextInt();
			
			//verificamos si es mayor de edad 
			if (persona1.edad >= 18) {
				edad1 = "mayor";
			} else {
				edad1 = "menor";
			}
			
			//verificamos si es mayor de edad 
			if (persona2.edad >= 18) {
				edad2 = "mayor";
			} else {
				edad2 = "menor";
			}
			
			//mostramos el dialogo de la primera persona
			System.out.println(persona1.nombre + " " + persona1.apellido + " con dni " + persona1.dni + " es " + edad1 + " de edad.");
			
			//mostramos el dialogo de la segunda pèrsona
			System.out.println(persona2.nombre + " " + persona2.apellido + " con dni " + persona2.dni + " es " + edad2 + " de edad.");
	}
}
