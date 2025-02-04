package parte2.ejercicio4;

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
		double iva = (double) sofa.precio * ((double) sofa.IVA / 100);

		// deducimos el precio con iva
		System.out.println(sofa.nombre + " - " + sofa.precio + " -  IVA : " + sofa.IVA + " - PVP : " + (double) (sofa.precio + IVA));
	}
}