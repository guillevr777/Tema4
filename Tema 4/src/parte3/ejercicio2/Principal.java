package parte3.ejercicio2;

import java.util.Scanner;

import parte3.ejercicio2.Persona;

public class Principal {

	public static void main(String[] args) {
		
		//llamaos a la clase Scanner
		Scanner reader = new Scanner(System.in);
		
		//variable para guardar los datos temporalmente
		String dni;
		String nombre;
		String apellidos;
		int edad;
		String edad1;
		String edad2;
		
		//llamamos a los metodos
		Persona persona1;
		Persona persona2;

			//preguntamos por valor a asignar a las personas
			System.out.println("Dime un nombre, dni , apellido y edad :");
			nombre = reader.next();
			dni = reader.next();
			apellidos = reader.next();
			edad = reader.nextInt();
			
			//llamamos al metodo
			persona1 = new Persona(dni, nombre, apellidos, edad);
			
			System.out.println("Dime otro nombre, dni , apellido y edad :");
			nombre = reader.next();
			dni = reader.next();
			apellidos = reader.next();
			edad = reader.nextInt();
						
			//llamamos al metodo
			persona2 = new Persona(dni, nombre, apellidos, edad);
			
			 // Verificamos si cada persona es mayor o menor de edad
	        edad1 = (persona1.getEdad() >= 18) ? "mayor" : "menor";
	        edad2 = (persona2.getEdad() >= 18) ? "mayor" : "menor";
			
	        // Mostramos el diálogo de la primera persona
	        System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " con DNI " + persona1.getDni() + " es " + edad1 + " de edad.");

	        // Mostramos el diálogo de la segunda persona
	        System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " con DNI " + persona2.getDni() + " es " + edad2 + " de edad.");

		//cerramos el escaner
		reader.close();
	}
}
