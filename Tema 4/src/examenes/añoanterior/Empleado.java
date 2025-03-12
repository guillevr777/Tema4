package examenes.añoanterior;

import partecuatro.ejercicio3.Pizza;

public class Empleado {

	private String dni;
	private String nombre;
	private int sueldo;
	private int horas;
	private int importe = 0;
	
	public Empleado (String dni) {
		if (dni != null) {
		this.dni = dni;
		}
	}
	
	public Empleado (String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public Empleado (String dni, String nombre, int sueldo, int horas, int importe) {
		this.dni = dni;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.horas = horas;
		this.importe = importe;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
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
	
	public int importeHoraExtra () {
		return this.horas * 10;
	}
	
	public int sueldoBruto () {
		int sueldoBruto = 0;
		
		sueldoBruto = sueldo + importeHoraExtra();
		
		return sueldoBruto;
	}
	
	@Override
	public boolean equals (Object obj) {
		boolean iguales = false;
		Empleado emp = (Empleado) obj;
		if (this.dni == emp.dni) {
			iguales = true;
		}
		return iguales;
	}
	
	@Override
	public String toString() {
		return this.dni + " " + this.nombre + "\nHoras extras : " + this.horas + "\nSueldo bruto : " + this.sueldoBruto();	
	}
}
