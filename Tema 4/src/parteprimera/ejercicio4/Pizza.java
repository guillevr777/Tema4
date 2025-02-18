package parteprimera.ejercicio4;

import parteprimera.ejercicio3.Alumno;

public class Pizza {

	private int codigo;
	private String tamaño;
	private String tipo;
	private String estado;
	
	/**
	 * Conjunto de constantes predefinidas para tamaño
	 */
	enum tamaño {
		Mediana,Familiar
	}
	
	/**
	 * Conjunto de constantes predefinidas para tipo
	 */
	enum tipo {
		Margarita,CuatroQuesos,Funghi
	}
	
	/**
	 * Conjunto de constantes predefinidas para estado
	 */
	enum estado {
		Pedida,Servida
	}
	
	/**
	 * Creamos un constructor con todos los atributos menos el estado que se adjuntara con un set
	 * @param codigo El codigo del objeto que pertenece a una pizza
	 * @param tamaño El tamaño que tendra la pizza
	 * @param tipo El tipo de pizza que sera
	 */
	public Pizza (int codigo, String tamaño, String tipo) {
		this.codigo = codigo;
		this.tamaño = tamaño;
		this.tipo = tipo;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (codigo != 0) {
		this.codigo = codigo;
		}
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		if (tamaño != null) {
		this.tamaño = tamaño;
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tamaño != null) {
		this.tipo = tipo;
		}
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if (tamaño != null) {
		this.estado = estado;
		}
	}
	
	public String toString() {
		return this.codigo + ": " + this.tamaño + " - " + this.tipo + " - " + this.estado;
	}
	
	/**
	 * Hace equals del codigo de dos objetos
	 */
	@Override
	public boolean equals(Object obj) {
		boolean iguales;
		Pizza pizza2 = (Pizza) obj;
		if (this.codigo == pizza2.codigo) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;
	}
}
