package parteprimera.ejercicio3;

public class Alumno {

	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private double nota;
	
	public Alumno (String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	
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
	 * ToString de el nombre y nota del alumno
	 */
	public String toString() {
		return "Nombre:" + this.nombre + " Apellidos: " + this.primerApellido + " " + this.segundoApellido + " Nota:" + this.nota;
	}
	
	@Override
	public boolean equals(Object obj) {
	    // Verificar si el objeto recibido es null
	    if (obj == null) {
	        return false;
	    }
	    
	    // Verificar si el objeto es de la misma clase
	    if (!(obj instanceof Principal)) {
	        return false;
	    }
	    
	    // Convertir obj a MiClase
	    Principal otro = (Principal) obj;
	    
	    // Comparar el atributo nombre, evitando NullPointerException
	    return this.nombre != null && this.nombre.equals(otro.nombre);
		}
	}
}
