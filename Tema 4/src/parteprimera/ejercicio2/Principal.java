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
		
		//mostramos ficha libro 2 probando metodos set y get
		System.out.println("Titulo libro2: " + libro2.getTitulo());
		System.out.println("Autor libro2: " + libro2.getAutor());
		System.out.println("Num. Ejemplares libro2: " + libro2.getNumEjemplares());
		System.out.println("Prestados libro2: " + libro2.getEjemplaresPrestados());
		libro2.setGenero("Poetico");
		System.out.println("Genero libro2: " + libro2.getGenero());
		
		//provamos que funcionen correctamente los constructores
		System.out.println("Se realizara un prestamo de un libro titulado \"El silencio de los corderos\"");
		if (libro2.prestamo()) {
			System.out.println("Se efectuo el prestamo correctamente.");
		} else {
			System.out.println("El prestamo no pudo efectuarce debido a no quedar stock");
		}
		System.out.println("A continuacion se devuelve el libro 1");
		if (libro1.devolucion()) {
			System.out.println("El libro se devolvio con exito");
		} else {
			System.out.println("El libro nunca se presto");
		}
		
		//probamos el toString
	    System.out.println(libro3.toString());
	    
	    if (libro1.equals(libro3)) {
	    	System.out.println("El libro 1 y 3 son iguales");
	    } else {
	    	System.out.println("El libro 1 y 3 son distintos");
	    }
	    }
}
