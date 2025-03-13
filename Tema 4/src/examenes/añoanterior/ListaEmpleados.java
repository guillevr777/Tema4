package examenes.añoanterior;

import java.util.HashSet;
import java.util.Set;

public class ListaEmpleados {

	static Set<Empleado> empleados = new HashSet<Empleado>();
	
	public static void listar () {
		for (Empleado em : empleados) {
			System.out.println(em);
			System.out.println("-----------------------");
		}
	}
	
	public static boolean añadirEmpleado (String dni, String nombre, int sueldoBruto) {
		boolean exito = false;
		Empleado empleado = new Empleado(dni,nombre,sueldoBruto);
		if (empleados.add(empleado)) {
			exito = true;
		}
		return exito;
	}
	
	public static boolean eliminarEmpleado (Object obj) {
		return empleados.remove(obj);
	}
	
	public static boolean modificarHorasExtra (String dni, int horas) {
		boolean exito = false;
		
		Empleado emp = null;
		for (Empleado em : empleados) {
			if (em.getDni().equalsIgnoreCase(dni)) {
				emp = em;
				emp.setHorasExtra(horas);
				exito = true;
			}
		}
		return exito;
	}
}
