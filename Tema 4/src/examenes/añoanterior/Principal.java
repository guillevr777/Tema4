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
				System.out.println("Dime un dni con su letra.");
				dni = reader.nextLine();
				if (EmpleadoCrud.crearEmpleado(dni)) {
					System.out.println("Se realizo correctamente la operacion.");
				} else {
					System.out.println("No se realizo correctamente la operacion.");
				}
			}
			case 2 -> {
				EmpleadoCrud.listado();		
			}
			case 3 -> {
				System.out.println("Dime el dni del empleado.");
				dni = reader.nextLine();
				System.out.println("Dime las horas extras que ha trabajado.");
				horas = reader.nextInt();
				
			}
			case 4 -> {
				if (EmpleadoCrud.modificarImporte()) {
					System.out.println("Operación realizada con exito.");
				} else {
					System.out.println("No se pudo llevar a cabo la operación.");
				}
			}
			case 5 -> {
				System.out.println("Dime el dni del empleado a eliminar.");
				dni = reader.nextLine();
				if (EmpleadoCrud.borrar(dni)) {
					System.out.println("El empleado fue eliminado de la BBDD.");
				} else {
					System.out.println("Hubo algun problema con la BBDD.");
				}
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
