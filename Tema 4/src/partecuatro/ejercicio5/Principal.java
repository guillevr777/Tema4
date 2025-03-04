package partecuatro.ejercicio5;

import java.util.Scanner;

import partecuatro.ejercicio1.AlumnoCRUD;
import partecuatro.ejercicio4.Disco;
import partecuatro.ejercicio4.DiscoCrud;

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
				
				if (CuentaCrud.crearCuenta(dni, nombre, saldoIncial)) {
					System.out.println("Operacion exitosa.");
				} else {
					System.out.println("Operacion abortada sin exito....");
				}
			}
			case 3 -> {
				System.out.println("Dime que usuario quieres borrar diciendome el DNI.");
				dni = reader.nextLine();
				CuentaCorriente cuenta = CuentaCrud.encontrar(dni);
				if (cuenta != null) {
					CuentaCrud.borrarCuenta(cuenta);
					System.out.println("Se creo satisfactoriamente.");
				} else {
					System.out.println("No se pudo crear la cuenta.");
				}
			}
			case 4 -> {
				System.out.println("Dime el dni de la cuenta a buscar.");
				dni = reader.nextLine();
				CuentaCorriente cuenta = CuentaCrud.encontrar(dni);
				System.out.println("Estos serian los datos de su cuenta bancaria : " + cuenta);
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