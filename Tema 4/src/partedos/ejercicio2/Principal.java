package partedos.ejercicio2;

public class Principal {

	public static void main(String[] args) {
		
		// Creamos un objeto de la clase Suma
		Media media = new Media();

		// Variables de tipo entero 
		int numeroUno = 32;
		int numeroDos = 10;
		int numeroTres = 42;
		
		// Llamamos a la clase Media
		System.out.println("Devolvemos la media de los numeros :");
		System.out.println(media.Media(numeroUno, numeroDos));
		System.out.println(media.Media(numeroUno, numeroDos, numeroTres));
	}
}
