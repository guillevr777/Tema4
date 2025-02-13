package parteprimera.ejercicio2;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[]args) {
		
		//llamamos al escaner
		Scanner reader = new Scanner(System.in);
		
		//llamamos a los contructores
		Libro libro1 = new Libro("Harry Potter", "JK.Rowling");
		Libro libro2 = new Libro("El silencio de los corderos", "Anonimo", 3, 0);
		Libro libro3 = new Libro("Boku No Pico", "Anonimo", 5, 4, "Poetico");
		
		//preguntamos por prestamos a realizar
		System.out.println("Se realizara un prestamo de un libro titulado \"El silencio de los corderos\"");
		if (libro2.prestamo()) {
			System.out.println("Se efectuo el prestamo correctamente.");
		} else {
			System.out.println("El prestamo no pudo efectuarce debido a no quedar stock");
		} 
	}
}
