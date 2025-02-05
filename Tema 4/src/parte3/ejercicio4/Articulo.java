package parte3.ejercicio4;

public class Articulo {
	private String nombre;
	private double precio;
	private double IVA;
	private int cantidad;
	
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
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
		this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getIVA() {
		return IVA;
	}

	public void setIVA(double iVA) {
		if (iVA > 0) {
		IVA = iVA;
		}
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		if (cantidad > 0) { 
		this.cantidad = cantidad;
		}
	}
}
