package parteprimera.ejercicio2;

public class Libro {
	
	private String titulo;
	private String autor;
	private String genero;
	private int ejemplaresPrestados;
	private int numEjemplares;
	
	/**
	 * Enumeración que representa los diferentes géneros literarios.
	 */
	enum genero {
		Narrativo, Lírico, Dramático, Didáctico, Poético
	}

	/**
	 * devuelve el titulo del libro
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * recoge el titulo del libro
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	 * devuvleve el autor del libro
	 * @return
	 */
	public String getAutor() {
		return autor;
	}
	
	/**
	 * recoge el autor del libro
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	/**
	 * devulve el genero del libro
	 * @return
	 */
	public String getGenero() {
		return genero;
	}
	
	/**
	 * recoge el genero del libri
	 * @param genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	/**
	 * devulve el numero de libros prestados
	 * @return
	 */
	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}
	
	/**
	 * recoge el numero de ejemplares prestados
	 * @param ejemplaresPrestados
	 */
	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}
	
	/**
	 * devuelve el numero de ejemplares
	 * @return
	 */
	public int getNumEjemplares() {
		return numEjemplares;
	}
	
	/**
	 * recoge el numero de ejemplares
	 * @param numEjemplares
	 */
	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}
	
	/**
	 * Constructor para crear un libro con título, autor, número de ejemplares y
	 * cantidad de ejemplares prestados.
	 * 
	 * @param titulo        El título del libro.
	 * @param autor         El autor del libro.
	 * @param numEjemplares El número total de ejemplares del libro.
	 * @param prestados     La cantidad de ejemplares prestados del libro.
	 * @throws IllegalArgumentException si el título o el autor están vacíos, el
	 *                                  número de ejemplares es negativo o la
	 *                                  cantidad de ejemplares prestados es mayor al
	 *                                  total de ejemplares
	 */
	public Libro (String titulo, String autor, int numEjemplares, int ejemplaresPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
	}
	
	/**
	 * Constructor para crear un libro con título y autor.
	 * 
	 * @param titulo El título del libro.
	 * @param autor  El autor del libro.
	 * @throws IllegalArgumentException si el título o el autor están vacíos
	 */
	public Libro (String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	/**
	 * Constructor para crear un libro con todos sus atributos.
	 * 
	 * @param titulo        El título del libro.
	 * @param autor         El autor del libro.
	 * @param numEjemplares El número total de ejemplares del libro.
	 * @param prestados     La cantidad de ejemplares prestados del libro.
	 * @param genero        El género literario del libro.
	 * @throws IllegalArgumentException si el título o el autor están vacíos, el
	 *                                  número de ejemplares es negativo o la
	 *                                  cantidad de ejemplares prestados es mayor al
	 *                                  total de ejemplares
	 */
	public Libro (String titulo, String autor, int numEjemplares, int ejemplaresPrestados, String genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
		this.genero = genero.valueOf(genero.toUpperCase());
	}
	
	/**
	 * Se encarga de realizar el prestamo de un libro
	 * @return clase boolean true si es exitoso
	 */
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
	
	/**
	 * Se emcarga de realizar la devolucion de libros
	 * @return De clase boolean true afirmativo y false en caso negativo
	 */
	public boolean devolucion() {
        if (ejemplaresPrestados > 0) {
        	ejemplaresPrestados--;
            return true;
        }
        return false;
    }
	
	/**
	 * Pasa un texto a string
	 */
	public String toString() {
        return "Libro{" + "Título='" + titulo + '\'' + ", Autor='" + autor + '\'' + ", Número de Ejemplares=" + numEjemplares + ", Número de Ejemplares Prestados=" + ejemplaresPrestados + ", Género='" + genero + '\'' + '}';
    }
	
	/**
	 * compara si dos objetos son iguales
	 */
	public boolean equals(Object obj) {
	    return obj instanceof Libro libro &&
	           titulo.equalsIgnoreCase(libro.titulo) &&
	           autor.equalsIgnoreCase(libro.autor);
	}
}
