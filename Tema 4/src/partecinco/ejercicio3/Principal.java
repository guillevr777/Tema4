package partecinco.ejercicio3;

import java.util.Scanner;

public class Principal {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		Fecha fecha1 = null;
		int opc;
		int dia;
		int mes;
		int año;
		
		do {
			menu();
			System.out.println("Que quieres hacer?");
			opc = reader.nextInt();
			reader.nextLine();
			switch (opc) {
			case 1 -> {
				System.out.println("Dime el dia mes y año separado por un espacio.");
				dia = reader.nextInt();
				reader.nextLine();
				mes = reader.nextInt();
				reader.nextLine();
				año = reader.nextInt();
				reader.nextLine();
				if (fecha1.esCorrecta(dia, mes, año)) {
					fecha1 = new Fecha(dia, mes, año);
					System.out.println("Operacion realizada con exito.");
				} else {
					System.out.println("La operacion no se pudo obtener con exito.");
				}
			}
			case 2 -> {
				System.out.println("Antes : " + fecha1.toString());
				fecha1.diaSiguiente();
				System.out.println("Despues : " + fecha1.toString());
			}
			case 3 -> {
				System.out.println(fecha1.toString());
			}
			case 4 -> {
				System.out.println("Saliste del programa.");
			}
			}
		} while (opc != 4);
		
	}
	static void menu () {
		System.out.println("1.Comprobar fecha\n2.Avanzar 1 dia\n3.Listar");
	}
}
