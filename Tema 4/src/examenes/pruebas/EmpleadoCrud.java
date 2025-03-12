package examenes.pruebas;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase para gestionar empleados con operaciones de tipo Crud
 */
public class EmpleadoCrud {

	/**
	 * Atributo que va a ser la coleccion donde almacenar nuestros objetos
	 */
	public static Set<Empleado> empleados = new HashSet<Empleado>();
		
	/**
	 * Muestra por consola la lista de empleados en la coleccion
	 */
	public static void listado () {
		for (Empleado e : empleados) {
		System.out.println(e);
		System.out.println("--------------");
		}
	}
	
	/**
	 * Crea un empleado y lo añade a la colleccion
	 * @param dni Dni del empleado que queremeos añadir a la colleccion
	 * @return Devuelve true si lo consigue y false si no lo hace
	 */
	public static boolean crearEmpleado (String dni) {		
		boolean esVerdad = false;;
		Empleado empleado = new Empleado(dni);
		if (empleados.add(empleado)) {
			esVerdad = true;
		} else {
			esVerdad = false;
		}
		return esVerdad;
	}
	
	public static Empleado encontrar(String dni) {
		Empleado empleado = null;
		for (Empleado c : empleados) {
			if (c.getDni().equals(dni)) {
				empleado = c;
			}
		}
		return empleado;
	}
	
	public static boolean borrar (Object obj) {
		return empleados.remove(obj);
	}
	
	public static boolean modificarHorasExtra (int hora, String dni) {
		boolean verdad = false;
		if (encontrar(dni).setHoras(hora)) {
			verdad = true;
		}
		return verdad;
	}
	
//	public static boolean modificarHorasExtra (int hora, String dni) {
//		Empleado emp = null;
//		for (Empleado e : empleados) {
//			if (e.getDni().equalsIgnoreCase(dni)) {
//				emp = e;
//			}
//		}
//		return emp.setHoras(hora);
//	}
	
//	public static boolean modificarHorasExtra (int hora, String dni) {
//	boolean esVerdad = false;
//	Empleado emp = null;
//	for (Empleado e : empleados) {
//		if (e.getDni().equalsIgnoreCase(dni)) {
//			emp = e;
//		}
//	}
//	emp.setHoras(hora);
//	if (emp.getHoras() != 0) {
//		esVerdad = true;
//	}
//	return esVerdad;
//}
}
