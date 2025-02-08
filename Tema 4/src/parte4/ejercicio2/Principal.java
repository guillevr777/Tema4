package parte4.ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//llamaos a la clase Scanner
		Scanner reader = new Scanner(System.in);
		
		//variable para guardar los datos temporalmente
		String dni;
		String nombre;
		String apellidos;
		int edad;
		
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
			
			if (persona1.esMayorEdad()) {
				System.out.println("La primera persona es adulta");
			} else {
				System.out.println("La primera persona es menor");
			}
			
			if (persona2.esJubilado()) {
				System.out.println("La segunda persona esta jubilada.");
			} else {
				System.out.println("La segunda persona no esta jubilada.");
			}
			
	        // Mostramos el diálogo de la primera persona
	        System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " con DNI " + persona1.getDni());

	        // Mostramos el diálogo de la segunda persona
	        System.out.println(persona2.toString());

		//cerramos el escaner
		reader.close();
	}
}
