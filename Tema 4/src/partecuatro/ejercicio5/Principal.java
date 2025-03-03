package partecuatro.ejercicio5;

import java.util.Scanner;

import partecuatro.ejercicio1.AlumnoCRUD;

public class Principal {
	
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[]args) {
		
	int opc;
	String dni;
	String nombre;
	int saldoIncial;
	
	do {
		
		System.out.println("Que opcion quieres elegir?");
		menu();
		opc = reader.nextInt();
		reader.nextLine();
		
			switch (opc) {
			case 1 -> {
				CuentaCrud.listado();
			}
			case 2 -> {
				System.out.println("Dime tu dni para la cuenta");
				dni = reader.nextLine();
				System.out.println("Dime tu nombre para la cuenta");
				nombre = reader.nextLine();
				System.out.println("Dime tu saldo inicial para la cuenta");
				saldoIncial = reader.nextInt();
				reader.nextLine();
				
			}
			case 3 -> {
				
			}
			case 4 -> {
				
			}
			case 5 -> {
				System.out.println("Se desconecto el sistema...");
			}
			}
		} while (opc != 5);
	}
	static void menu () {
		System.out.println("1.Listado\n2.Añadir Cuenta\n3.Eliminar Cuenta\n4.Buscar Cuenta\n5.Salir");
	}
}