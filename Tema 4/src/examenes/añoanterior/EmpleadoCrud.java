package examenes.añoanterior;

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
	public static boolean crearEmpleado (String dni, String nombre, int sueldo) {		
		boolean esVerdad = false;;
		Empleado empleado = new Empleado(dni, nombre, sueldo);
		if (empleados.add(empleado)) {
			esVerdad = true;
		} else {
			esVerdad = false;
		}
		return esVerdad;
	}
	
	/**
	 * Borra al empleado de la coleccion
	 * @param obj Objeto empleado a eliminar
	 * @return Devuelve true si fue posible eliminarlo y false si no lo fue
	 */
	public static boolean borrar (Object obj) {
		return empleados.remove(obj);
	}
	
	/**
	 * Modifica las horas extras del empleado
	 * @param hora Horas que hecho el empleado
	 * @param dni Dni del empleado
	 * @return Devuelve true si todo fue bien y false si no pudo hacerse nada
	 */
	public static boolean modificarHorasExtra (int hora, String dni) {
		Empleado emp = null;
		for (Empleado e : empleados) {
			if (e.getDni().equalsIgnoreCase(dni)) {
				emp = e;
			}
		}
		return emp.setHoras(hora);
	}
	
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
