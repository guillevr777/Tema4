package examenes.añoanterior;

import java.util.Scanner;

public class Principal {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {

			int opc;
			String dni;
			String nombre;
			int sueldoBruto;
			int horasExtra;
			int importeHorasExtra;
			
			do {
				menu();
				opc = reader.nextInt();
				reader.nextLine();
				switch (opc) {
				case 1 -> {
					dni = dni();
					System.out.println("Dime el nombre");
					nombre = reader.nextLine();
					System.out.println("Dime el sueldoBruto");
					sueldoBruto = reader.nextInt();
					reader.nextLine();
					if (ListaEmpleados.añadirEmpleado(dni, nombre, sueldoBruto)) {
						System.out.println("Se pudo");
					}
				}
				case 2 -> {
					ListaEmpleados.listar();
				}
				case 3 -> {
					dni = dni();
					
				}
				case 4 -> {
					
				}
				case 5 -> {
					dni = dni();
					if (ListaEmpleados.eliminarEmpleado(dni)) {
						System.out.println("Se pudo");
					}
				}
				case 0 -> {
					System.out.println("Saliste.");
				}
				default -> {
					System.out.println("Error");
				}
				}
			} while (opc != 0);
	}
	public static void menu () {
		System.out.println("1.Crear Empleado\n2.Listar\n3.Modificar Horas Extra\n4.Modificar Importe Horas Extra\n5.Eliminar Empleado\n0.Salir");
	}
	public static String dni () {
		String dni = "";
		System.out.println("Dime tu dni");
		dni = reader.nextLine();
		return dni;
	}
}
