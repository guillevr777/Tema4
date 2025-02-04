package parte2.ejercicio2;

public class Persona {
	String dni;
	String nombre;
	String apellido;
	int edad;
	
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
		this.apellido = apellido;
		this.edad = edad;
	}
}
