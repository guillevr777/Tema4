package partecinco.ejercicio3;

import java.util.Scanner;

public class Principal {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		Fecha fecha1 = new Fecha(0,0,0);
		int opc;
		int dia;
		int mes;
		int año;
		
		do {
			menu();
			System.out.println("Que quieres hacer?");
			opc = reader.nextInt();
			switch (opc) {
			case 1 -> {
				System.out.println("Dime el dia mes y año separado por un espacio.");
				dia = reader.nextInt();
				mes = reader.nextInt();
				año = reader.nextInt();
				if (fecha1.esCorrecta(dia, mes, año)) {
					fecha1.setAño(año);
					fecha1.setDia(dia);
					fecha1.setMes(mes);
					System.out.println("Operacion realizada con exito.");
				} else {
					System.out.println("La operacion no se pudo obtener con exito.");
				}
			}
			case 2 -> {
				fecha1.diaSiguiente();
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
