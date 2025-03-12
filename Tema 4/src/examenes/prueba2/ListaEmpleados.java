package examenes.prueba2;

import java.util.HashSet;
import java.util.Set;

public class ListaEmpleados {

	/**
	 * Atributo que va a ser la coleccion donde almacenar nuestros objetos
	 */
	public static Set<Empleado> empleados = new HashSet<Empleado>();
	
	/**
	 * Metodo encargado de listar todos los empleados de la coleccón
	 */
	public static void listarEmpleados () {
		for (Empleado e : empleados) {
			System.out.println(e);
			System.out.println("-----------------------------");
		}
	}
	
	/**
	 * Metodo encargado de añadir un empleado nuevo a la coleccion
	 * @param dni Dni del empleado
	 * @param nombre Nombre del empleado
	 * @param sueldo Sueldo del empleado
	 * @return Devuelve un booleano , true si se consiguio hacer la operacion y false si no se pudo
	 */
	public static boolean nuevoEmpleado (String dni, String nombre, int sueldo) {
		boolean exito = false;
		Empleado emp = new Empleado(dni, nombre, sueldo);
		for (Empleado em : empleados) {
		if (em.equals(emp)) {
			exito = true;
		}
		}
		return exito;
	}
	
	/**
	 * Metodo que se encarga de modificar las horas extras
	 * @param dni Dni del empleado
	 * @param horasExtras Horas extras del empleado
	 * @return Devuelve true si sale exitosa la operacion o false en caso contrario
	 */
	public static boolean modificarHorasExtras (String dni, int horasExtras) {
		boolean exito = false;
		Empleado emp = null;
		for (Empleado em : empleados) {
			if (dni.equals(em)) {
				emp = em;
				emp.setHorasExtras(horasExtras);
				exito = true;
			}
		}
		return exito;
	}
	
	/**
	 * Elimina el empleado de la coleccion
	 * @param obj Objeto de empleado
	 * @return Devuelve true si consigue eliminarlo y false si lo consigue
	 */ 
	public static boolean eliminarEmpleado (Object obj) {
		return empleados.remove(obj);
	}
}
