package parteprimera.ejercicio3;

import java.util.Objects;

public class Alumno {

	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private double nota;
	
	/**
	 * Creamos el objeto metiendo por parametro los atributos
	 * @param nombre nombre del objeto en string
	 * @param nota nota del objeto en double
	 */
	public Alumno (String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	
	/**
	 * Creamos el objeto metiendo por parametro los atributos
	 * @param nombre nombre nombre del objeto en string
	 * @param primerApellido primerApellido del objeto en string
	 * @param segundoApellido segundoApellido del objeto en string
	 * @param nota nota del objeto en double
	 */
	public Alumno (String nombre, String primerApellido, String segundoApellido, double nota) {
		this.nombre = nombre;
		this.nota = nota;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPrimerApellido() {
		return primerApellido;
	}
	
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	
	public String getSegundoApellido() {
		return segundoApellido;
	}
	
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	/**
	 * ToString del nombre, apellidos y nota del alumno
	 */
	public String toString() {
		return "Nombre:" + this.nombre + " Apellidos: " + this.primerApellido + " " + this.segundoApellido + " Nota:" + this.nota;
	}
	
	/**
	 * Hace equals del nombre de dos objetos
	 */
	@Override
	public boolean equals(Object obj) {
		boolean iguales;
		Alumno alum2 = (Alumno) obj;
		if (this.nombre.equals(alum2.nombre)) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;
		}
	}
