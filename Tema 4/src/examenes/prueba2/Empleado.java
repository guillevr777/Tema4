package examenes.prueba2;

import java.util.Objects;

public class Empleado {

	/**
	 * Atributo donde se guardara el dni del empleado
	 */
	private String dni;
	
	/**
	 * Atributo donde se guardara el nombre del empleado
	 */
	private String nombre;
	
	/**
	 * Atributo donde se guardara el sueldo base del empleado
	 */
	private int sueldoBase;
	
	/**
	 * Atributo donde se guardaran las horas extras del empleado
	 */
	private int horasExtras;
	
	/**
	 * Atributo donde se guardara el importe de las horas extras del empleado
	 */
	private static int importeHorasExtras = 10;

	/**
	 * Constructor de la clase Empleado
	 * @param dni Dni del empleado
	 * @param nombre Nombre del empleado
	 * @param sueldoBase Sueldo base del empleado
	 * @param horasExtras Numero de horas extras que hechó el empleado
	 * @param importeHorasExtras Importe por cada hora extra que hecho el empleado
	 */
	public Empleado(String dni, String nombre, int sueldoBase) {
		this.dni = dni;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
	}

	/**
	 * Get del dni del empleado
	 * @return Devuelve el dni del empleado
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Setter del sueldo base del empleado
	 * @param sueldoBase Sueldo base que cobrara el empleado
	 */
	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	/**
	 * Settet de las horas extras del empleado
	 * @param horasExtras Horas extras que hizo el empleado
	 */
	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	/**
	 * Setter del importe que cobrara por hora extra
	 * @param importeHorasExtras Importe por cada hora extra
	 */
	public void setImporteHorasExtras(int importeHorasExtras) {
		this.importeHorasExtras = importeHorasExtras;
	}
	
	/**
	 * Calcula el complemento
	 * @return Devuelve la multiplicacion de horas por el importe
	 */
	public double calcularComplemento () {
		return this.horasExtras * this.importeHorasExtras;
	}
	
	/**
	 * calcula el sueldo bruto
	 * @return Devuelve el sueldo base por el complemento
	 */ 
	public double sueldoBruto () {
		return this.sueldoBase * this.calcularComplemento();
	}
	
	/**
	 * Modifica el importe por hora extra 
	 * @param importe Importe por cada hora extra
	 * @return Devuelve true si funciona y false si no lo hace
	 */
	public boolean modificarImporteHorasExtra (int importe) {
		boolean exito = false;
		
		Empleado.importeHorasExtras = importe;
		if (Empleado.importeHorasExtras == importe) {
			exito = true;
		}
		
		return exito;
	}
	
	/**
	 * Muestra todos los datos del empleado en String
	 */
	@Override
	public String toString () {
		return this.dni + " " + this.nombre + "\nHoras Extras : " + this.horasExtras + "\nSueldo Bruto : " + this.sueldoBruto();
	}
	
	/**
	 * Compara dos objetos y devuleve true si son iguales y false si no lo son
	 */
	@Override
	public boolean equals (Object obj) {
		boolean iguales = false;
		
		Empleado empleado = (Empleado) obj;
		if (this.dni.equalsIgnoreCase(empleado.dni)) {
			iguales = true;
		}
		
		return iguales;
	}
	
	/**
	 * Se encarga de asignarle un codigo al empleado usando el dni
	 */
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
}
