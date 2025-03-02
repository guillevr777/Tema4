package partecuatro.ejercicio3;

import java.util.Scanner;

public class Principal {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		Pizza pizza;
		String tamaño;
		int codigo;
		String tipo;
		int opc;
		String estado;
		
		do {
			System.out.println("Elige una opcion:");
			menu();
			opc = reader.nextInt();
			reader.nextLine();
			
			switch (opc) {
			case 1 -> {
				PizzaCrud.listadoPizza();
			}
			case 2 -> {
				System.out.println("Dime el codigo de la pizza");
				codigo = reader.nextInt();
				reader.nextLine();
				
				System.out.println("El tamaño");
				tamaño = reader.nextLine();
				
				System.out.println("Y el tipo");
				tipo = reader.nextLine();
				
				PizzaCrud.listarPizza(codigo, tamaño, tipo);
			}
			case 3 -> {
				
				System.out.println("Que pizza quieres modificar (Codigo)");
				codigo = reader.nextInt();
				reader.nextLine();
				
				System.out.println("Dime el estado actual de la pizza");
				estado = reader.nextLine();
				
				if (PizzaCrud.servida(codigo, estado)) {
					System.out.println("Se cambio el estado de la pizza con exito");
				} else {
					System.out.println("No se pudo actualizar el estado de la pizza.");
				}
			}
			case 4 -> {
				System.out.println("Cerrando el programa...");
			}
			}
		} while (opc != 4);
	}
	
	static void menu () {
		System.out.println("1.Listado de Pizzas\n2.Nuevo pedido\n3.Pizza servida\n4.Salir");
	}
}
