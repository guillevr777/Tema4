package parte2.ejercicio4;

public class Articulo {
	String nombre;
	double precio;
	double IVA;
	int cantidad;
	
	/**
	 * Creamos el constructor llamado articulo
	 * @param nombre Variable para guardar el nombre
	 * @param precio Variable para guardar el precio
	 * @param IVA Variable para guardar el iva
	 * @param cantidad Variable para guardar la cantidad de articulos
	 */
	public Articulo(String nombre, double precio, double IVA, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.IVA = IVA;
		this.cantidad = cantidad;
	}
}
