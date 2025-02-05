package parte3.ejercicio4;

public class Principal {

	public static void main(String[] args) {

		// declaramos variables para guardar temporalemnte los datos
		int cantidad;
		String nombre;
		double IVA;
		int precio;

		// asignamos valores a sofa
		cantidad = 13;
		nombre = "PremierDelux";
		IVA = 21;
		precio = 356;

		// llamamos al metodo sofa
		Articulo sofa = new Articulo(nombre, precio, IVA, cantidad);

		// variable de precio con iva
		double iva = (double) sofa.getPrecio() * ((double) sofa.getIVA() / 100);

		// deducimos el precio con iva
		System.out.println(sofa.getNombre() + " - " + sofa.getPrecio() + " -  IVA : " + sofa.getIVA() + " - PVP : " + (double) (sofa.getPrecio() + IVA));
	}
}