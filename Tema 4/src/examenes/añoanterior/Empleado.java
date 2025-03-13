package examenes.añoanterior;

import java.util.Objects;

public class Empleado {

	private String dni;
	private String nombre;
	private int sueldoBruto;
	private int horasExtra;
	private static int importeHorasExtra;
	
	public Empleado(String dni, String nombre, int sueldoBruto) {
		this.dni = dni;
		this.nombre = nombre;
		this.sueldoBruto = sueldoBruto;
	}

	public String getDni() {
		return dni;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	public void setImporteHorasExtra(int importeHorasExtra) {
		Empleado.importeHorasExtra = importeHorasExtra;
	}
	
	@Override
	public String toString () {
		return "a";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		Empleado empleados = (Empleado) obj;
		if (this.dni.equalsIgnoreCase(empleados.dni)) {
			iguales = true;
		}
		return iguales; 
	}
}
