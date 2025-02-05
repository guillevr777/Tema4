package parte3.ejercicio2;

public class Persona {
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	
	/**
	 * Creamos el constructor llamado Persona
	 * @param dni Sirve para guardar el dni
	 * @param nombre Sirve para guardar el nombre
	 * @param apellido Sirve para guardar el apellido
	 * @param edad Sirve para guardar la edad
	 */
	public Persona (String dni, String nombre, String apellido, int edad){
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellido;
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (dni != null && !dni.isBlank()) {
		this.dni = dni;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
		this.nombre = nombre;
		}
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		if (apellidos != null && !apellidos.isBlank()) {
		this.apellidos = apellidos;
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad > 0) {
		this.edad = edad;
		}
	}
}
