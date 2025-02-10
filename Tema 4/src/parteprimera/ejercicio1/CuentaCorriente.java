package parteprimera.ejercicio1;

public class CuentaCorriente {

	private String dni;
	private String nombre;
	private int saldo;
	private String nacionalidad;
	
	public CuentaCorriente (String dni, String nombre, int saldo, String nacionalidad) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
		this.nacionalidad = nacionalidad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}	
	
	public boolean sacarDinero (int dinero) {
		if (this.saldo < dinero) {
			return false;
		} else {
			this.saldo -= dinero;
			return true;
		}
	}
	
	public void ingresarDinero (int dinero) {
		this.saldo += dinero;
	}
	
	public String toString () {
		return " ";
	}
	
	public boolean iguales (String dni, String nombre) {
		if (dni.equals(this.dni) && nombre.equals(this.nombre)) {
			return true;
		} else {
			return false;
		}
	}
}
