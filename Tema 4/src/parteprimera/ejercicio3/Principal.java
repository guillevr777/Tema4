package parteprimera.ejercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//llamamos al escaner
		Scanner reader = new Scanner(System.in);

		//llamamos a los contructores
		Alumno alumno1 = new Alumno("Roman", "Saborido", "Zamora", 37.2);
		Alumno alumno2 = new Alumno("Guillermo", "Villanueva", "Villareal", 67.1);
		
		//probamos los set y get
		System.out.println("Preguntamos por el nombre del primer alumno");
		alumno1.getNombre();

		System.out.println("Le cambiamos el nombre a otro, cual quieres :");
		alumno1.setNombre(reader.next());
		
		//LLamamos al metodo equals para verificar si ambos nombres son iguales
		if (alumno1.equals(alumno2)) {
			System.out.println("El alumno 1 y el 2 se llaman igual");
		} else {
			System.out.println("Los alumnos se llaman diferente");
		}
		
		//mostramos los datos del primer alumno con el metodo toString
		System.out.println(alumno1.toString());
		
		//cerramos el escaner
		reader.close();
	}
}
