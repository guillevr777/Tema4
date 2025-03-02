package partecuatro.ejercicio4;

import java.util.Scanner;

import partecuatro.ejercicio1.AlumnoCRUD;

public class Principal {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		int opc;
		int codigo;
		String autor;
		String titulo;
		int duracion;
		String genero;
		
		do {
			System.out.println("Que opcion eliges?");
			menu();
			opc = reader.nextInt();
			reader.nextLine();
			
			switch (opc) {
			case 1 -> {
				DiscoCrud.listado();
			}
			case 2 -> {
				System.out.println("Dime el codigo que quieres ponerle");
				codigo = reader.nextInt();
				reader.nextLine();
				System.out.println("Dime el titulo");
				titulo = reader.nextLine();
				System.out.println("Dime el autor por ultimo");
				autor = reader.nextLine();
				
				DiscoCrud.listarDisco (codigo, autor, titulo);
			}
			case 3 -> {
				System.out.println("Dime el codigo del disco");
				codigo = reader.nextInt();
				reader.nextLine();
				
				Disco disco = DiscoCrud.buscaDisco(codigo);
				if (disco != null) {
					DiscoCrud.borrarDisco(disco);
					System.out.println("Disco eliminado correctamente.");
				} else {
					System.out.println("El disco no existe");
				}
			}
			case 4 -> {
				System.out.println("Cerrando el programa...");
			}
			}
		} while (opc != 4);
	}
	public static void menu () {
		System.out.println("1.Listado\n2.Nuevo disco\n3.Borrar\n4.Salir");
	}
}
