package examenes.pruebas;

import java.util.Objects;

import partecuatro.ejercicio3.Pizza;

public class Empleado {

	/**
	 * Atributo para almacenar el dni del empleado
	 */
	private String dni;
	
	/**
	 * Atributo para almacenar el nombre del empleado
	 */
	private String nombre;
	
	/**
	 * Atributo para almacenar el sueldo del empleado
	 */
	private int sueldo;
	
	/**
	 * Atributo para almacenar las horas extras del empleado
	 */
	private int horas;
	
	/**
	 * Atributo para almacenar el importe por hora extra del empleado
	 */
	private static int importe = 10;
	
	/**
	 * Constructor de la clase Empleado
	 * @param dni Dni del Empleado
	 */
	public Empleado (String dni) {
		if (dni != null) {
		this.dni = dni;
		}
	}
	
	/**
	 * Constructor de la clase Empleado
	 * @param dni
	 * @param nombre
	 */
	public Empleado (String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	
	/**
	 * Constructor de la clase Empleado
	 * @param dni
	 * @param nombre
	 * @param sueldo
	 */
	public Empleado (String dni, String nombre, int sueldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.horas = horas;
		this.importe = importe;
	}

	/**
	 * Get del sueldo del Empleado
	 * @return Devuelve el sueldo del empleado
	 */
	public int getSueldo() {
		return sueldo;
	}

	/**
	 * Setter del sueldo del empleado
	 * @param sueldo Sueldo que gana el empleado
	 */
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getHoras() {
		return horas;
	}

	public boolean setHoras(int horas) {
		boolean esVerdad = false;
		if (horas > 0) {
			this.horas = horas;
			esVerdad = true;
		}
		return esVerdad;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Setter de tipo booleano para indicar un importe por hora extra
	 * @param importe Importe que cobrara por hora
	 * @return Devuelve verdadero si se establece el importe o falso en caso contrario
	 */
	public boolean setImporteHorasExtra (int importe) {
		boolean esVerdad = false;
		
		if (Empleado.importe != importe) {
			Empleado.importe = importe;
			esVerdad = true;
		}
		
		return esVerdad;
	}
	
	public int calcularExtra () {
		return this.horas * Empleado.importe;
	}
		
	public int sueldoBruto () {
		int sueldoBruto = 0;
		
		sueldoBruto = this.sueldo + calcularExtra();
		
		return sueldoBruto;
	}	
	
	/**
	 * Metodo equals para comparar dos objetos 
	 * @param Resultado de comparar si el dni de los empleados son iguales
	 */
	@Override
	public boolean equals (Object obj) {
		boolean iguales = false;
		Empleado emp = (Empleado) obj;
		if (this.dni == emp.dni) {
			iguales = true;
		}
		return iguales;
	}
	
	/**
	 * Imprime los datos del empleado
	 * @return String que contiene todos los valores del empleado
	 */
	@Override
	public String toString() {
		return this.dni + " " + this.nombre + "\nHoras extras : " + this.horas + "\nSueldo bruto : " + this.sueldoBruto();	
	}
	
	 /**
     * Genera un código hash único basado en el DNI del empleado.
     * @return Código hash basado en el DNI del empleado.
     */
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
}
