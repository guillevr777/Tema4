package examenes.añoanterior;

import java.util.Scanner;

public class Principal {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {

		Empleado emp = null;
		int opc;
		String dni;
		String nombre;
		int sueldo;
		int horas;
		int importeExtra;
		
		System.out.println("Bienvenido a la BBDD de los empleados");
		
		do {
			System.out.println("Dime que opcion quieres?");
			menu();
			opc = reader.nextInt();
			
			switch (opc) {
			case 1 -> {
				
			}
			case 2 -> {
							
			}
			case 3 -> {
				
			}
			case 4 -> {
				
			}
			case 5 -> {
				
			}
			case 6 -> {
				System.out.println("Saliendo del sistema…");
			}
			}
		} while (opc != 6);
	}
	static void menu () {
		System.out.println("1.Añadir empleado.\r\n"
				+ "2.Listar empleados.\r\n"
				+ "3.Modificar horas extra.\r\n"
				+ "4.Modificar importe horas extra.\r\n"
				+ "5.Eliminar empleado.\r\n"
				+ "6.Salir.");
	}
}
