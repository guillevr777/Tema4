package examenes.añoanterior;

import java.util.HashSet;
import java.util.Set;

public class EmpleadoCrud {

	// Atributo que va a ser la coleccion donde almacenar nuestros objetos
	private static Set<Empleado> empleados = new HashSet<Empleado>();
		
	static void listado () {
		for (Empleado e : empleados) {
		System.out.println(e);
		System.out.println("--------------");
		}
	}
	
	static boolean crearEmpleado (String dni) {
		boolean esVerdad = false;;
		Empleado empleado = new Empleado(dni);
		if (empleados.add(empleado)) {
			esVerdad = true;
		} else {
			esVerdad = false;
		}
		return esVerdad;
	}
	
	static Empleado encontrar(String dni) {
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
	
	
}
