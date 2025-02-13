package parteprimera.ejercicio2;

public class Libro {
	
	private String titulo;
	private String autor;
	private String genero;
	private int ejemplaresPrestados;
	private int numEjemplares;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}
	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}
	public int getNumEjemplares() {
		return numEjemplares;
	}
	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}
	
	public Libro (String titulo, String autor, int numEjemplares, int ejemplaresPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
	}
	
	public Libro (String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public Libro (String titulo, String autor, int numEjemplares, int ejemplaresPrestados, String genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
		this.genero = genero;
	}
	
	public boolean prestamo() {
		boolean respuesta;
		if (numEjemplares > ejemplaresPrestados) {
			ejemplaresPrestados++;
			respuesta = true;
		} else {
			respuesta = false	;
		}
		return respuesta;
	}
	
	public boolean devolucion() {
        if (ejemplaresPrestados > 0) {
        	ejemplaresPrestados--;
            return true;
        }
        return false;
    }
	
	public String toString() {
        return "Libro{" + "Título='" + titulo + '\'' + ", Autor='" + autor + '\'' + ", Número de Ejemplares=" + numEjemplares + ", Número de Ejemplares Prestados=" + ejemplaresPrestados + ", Género='" + genero + '\'' + '}';
    }
	
	public boolean equals(Object obj) {
	    return obj instanceof Libro libro &&
	           titulo.equalsIgnoreCase(libro.titulo) &&
	           autor.equalsIgnoreCase(libro.autor);
	}
}
