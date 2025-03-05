package partecinco.ejercicio1;

import java.util.Scanner;

import partecinco.ejercicio1.Hora;

public class Principal {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		int opc;
		int hora;
		int minuto;
		int segundo;
		Hora españa = null;
		
		do {
			System.out.println("Elige una opcion:");
			menu(); 
			opc = reader.nextInt();
			reader.nextLine();
		switch (opc) {
		case 1 -> {
			System.out.println("Dime la hora a introducir:");
			hora = reader.nextInt();
			System.out.println("Dime los minutos");
			minuto = reader.nextInt();
			System.out.println("Dime los segundos");
			segundo = reader.nextInt();
			//Creamos un objeto de la clase hora
			españa = new Hora(hora, minuto, segundo);
		}
		case 2 -> {
			System.out.println("Hora en españa:");
			System.out.println(españa.toString());
		}
		case 3 -> {
			segundo = españa.getSegundo();
			minuto = españa.getMinuto();
			hora = españa.getHora();
			if (segundo == 59) {
		        segundo = 0;
		        if (minuto == 59) {
		            minuto = 0;
		            hora = (hora + 1) % 24;
		        } else {
		            minuto++;
		        }
		    } else {
		        segundo++;
		    }
		}
		case 4 -> {
			System.out.println("Saliendo del programa...");
		}
		}
		} while (opc != 4);
	}
	public static void menu () {
		System.out.println("1.Meter Hora\n2.Listar\n3.Añadir segundo\n4.Salir");
	}
}
