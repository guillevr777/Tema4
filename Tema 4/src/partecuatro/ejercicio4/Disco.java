package partecuatro.ejercicio4;

import partecuatro.ejercicio4.DiscoCrud;
import partecuatro.ejercicio4.Principal;

public class Disco {

	private int codigo;
	private String autor;
	private String titulo;
	private int duracion;
	private int genero;
	
	enum genero {
		Rock,
		Pop,
		Jazz,
		Blues
	}
	
	public Disco (int codigo, String autor, String titulo) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}
	
	public String toString() {
		return "Codigo : " + codigo + ", Autor : " + autor + ", Titulo : " + titulo + ", Duracion : " + duracion + ", Genero : " + genero;
	}
	
	public boolean equals(Object obj) {
		boolean iguales;
		Disco disco2 = (Disco) obj;
		if (this.codigo == disco2.codigo) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;
	}
}
