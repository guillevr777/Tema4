package examenes.prueba2;

import java.util.Scanner;

import examenes.añoanterior.Empleado;

public class Principal {

	//Llamamos al escaner
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {

		//variable de tipo entero donde guardaremos la opcion del menu temporalmente
		int opc;
		
		//variable de tipo String donde guardaremos el dni temporalmente
		String dni;
		
		//variable de tipo String donde guardaremos el nombre temporalmente
		String nombre;
		
		//variable de tipo entero donde guardaremos el sueldo base temporalmente
		int sueldoBase;
		
		//variable de tipo String donde guardaremos el numero de horas temporalmente
		int horasExtras;
		
		//variable de tipo String donde guardaremos el importe de las horas extras temporalmente
		int importeHorasExtra;
		
		//Un do-while que hara iteraciones hasta que se elija la opcion 0
		do {
			//Syso que sugiere que elijamos una opcion de las que se mostrara a continuacion
			System.out.println("Elige una opcion!");
			//Funcion menu que mostrara un Syso con todas las opciones a escoger en el switch
			menu();
			//La variable opc recoge la opcion introducida por consola
			opc = reader.nextInt();
			reader.nextLine();
			
			//Switch que utiliza el entero de la variable opc para elegir opcion
			switch (opc) {
			case 1 -> {
				System.out.println("Dime el dni del empleado, su nombre y su sueldo base.");
				dni = reader.nextLine();
				nombre = reader.nextLine();
				sueldoBase = reader.nextInt();
				if (ListaEmpleados.nuevoEmpleado(dni, nombre, sueldoBase)) {
					System.out.println("Operacion realiza con exito.");
				} else {
					System.out.println("Hubo algun percance...");
				}
			}
			case 2 -> {
				ListaEmpleados.listarEmpleados();
			}
			case 3 -> {
				System.out.println("Dime el dni del empleado y las horas extras que ha hechado.");
				dni = reader.nextLine();
				horasExtras = reader.nextInt();
				reader.nextLine();
				if (ListaEmpleados.modificarHorasExtras(dni, horasExtras)) {
					System.out.println("Operacion realizada con exito.");
				} else {
					System.out.println("Ocurrio algun error en la operacion...");
				}
			}
			case 4 -> {
				System.out.println("A cuando quieres cambiar la monetizacion de la horas extras?");
				importeHorasExtra = reader.nextInt();
				if (Empleado.setImporteHorasExtra(importeHorasExtra)) {
					System.out.println("Operación realizada con exito.");
				} else {
					System.out.println("No se pudo llevar a cabo la operación.");
				}
			}
			case 5 -> {
				System.out.println("Dime el dni del empleado a eliminar.");
				dni = reader.nextLine();
				if (ListaEmpleados.eliminarEmpleado(dni)) {
					System.out.println("Operacion realizada con exito.");
				} else {
					System.out.println("Hubo un error.");
				}
			}
			//Se finaliza la sesion
			case 0 -> {
				System.out.println("Finalizando sesion...");
			}
			//En caso de no elegir una de las opciones sugeridas el programa lo indicara por pantalla
			default -> {
				System.out.println("Opcion incorrecta...");
			}
			}
		} while (opc != 0);
	}
	//Funcion estatica menu que muestra las opciones a elegir mediante un SYSO
	public static void menu () {
		System.out.println("1.Añadir empleado\n"
						 + "2.Listas empleados\n"
						 + "3.Modificar Hora Extra\n"
						 + "4.Modificar Importe Hora Extra\n"
						 + "5.Eliminar Empleado\n"
						 + "0.Salir Del Programa");
	}
}
