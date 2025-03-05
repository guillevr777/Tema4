package partecinco.ejercicio2;

import java.util.Scanner;

public class Principal {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		Contador cuenta = null;
		int cont;
		int opc;
		
		do {
			System.out.println("Que opcion quieres elegir.");
			menu();
			opc = reader.nextInt();
			reader.nextLine();
			switch (opc) {
			case 1 -> {
				System.out.println("Dime a cuanto quieres iniciar el contador:");
				cont = reader.nextInt();
				reader.nextLine();
				cuenta = new Contador(cont);
				if (cuenta.getCont() != 0) {
					System.out.println("Se realizo satisfactoriamente.");
				} else {
					System.out.println("No se pudo realizar la operacion.");
				}
			}
			case 2 -> {
				cont = cuenta.getCont();
				cuenta.incrementar();
				if (cont != cuenta.getCont()) {
					System.out.println("Operacion realizada satisfactoriamente.");
				} else {
					System.out.println("No se pudo realizar satisfactoriamente.");
				}
			}
			case 3 -> {
				cont = cuenta.getCont();
				cuenta.decrementar();
				if (cont != cuenta.getCont()) {
					System.out.println("Operacion realizada satisfactoriamente.");
				} else {
					System.out.println("No se pudo realizar satisfactoriamente.");
				}
			}
			case 4 -> {
				System.out.println("Se salio satisfactoriamente del programa.");
			}
			}
		} while (opc != 4);
	}
	public static String menu () {
		return "1.Establecer Contador\n2.Incrementar\n3.Decrementar\n4.Salir";
	}
}
