package parte2.ejercicio2;

import java.util.Scanner;

import parte2.ejercicio2.Persona;

public class Principal {

	public static void main(String[] args) {
		
		//llamaos a la clase Scanner
		Scanner reader = new Scanner(System.in);

		//creamos variable i
		int i = 0;
		
		//variable para guardar los datos temporalmente
		String dni;
		String nombre;
		String apellidos;
		int edad;
		String edad1;
		String edad2;
		
		
			//preguntamos por valor a asignar a las personas
			System.out.println("Dime un nombre, dni , apellido y edad :");
			nombre = reader.next();
			dni = reader.next();
			apellidos = reader.next();
			edad = reader.nextInt();
			
			Persona persona1 = new Persona(dni, nombre, apellidos, edad);
			
			System.out.println("Dime otro nombre, dni , apellido y edad :");
			nombre = reader.next();
			dni = reader.next();
			apellidos = reader.next();
			edad = reader.nextInt();
			
			Persona persona2 = new Persona(dni, nombre, apellidos, edad);
			
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

		//cerramos el escaner
		reader.close();
	}
}
