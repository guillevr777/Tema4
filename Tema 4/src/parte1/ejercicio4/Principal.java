package parte1.ejercicio4;

public class Principal {

	public static void main(String[] args) {

		//llamamos a la clase articulo
		Articulo sofa = new Articulo();
		Articulo lampara = new Articulo();
		
		//asignamos valores a sofa
		sofa.cantidad = 13;
		sofa.nombre = "PremierDelux";
		sofa.iva = 21;
		sofa.precio = 356;
		
		//asignamos valores a lampara
		lampara.cantidad = 3;
		lampara.nombre = "IvanTontito";
		lampara.precio = 56;
		lampara.iva = 21;
		
		//variable de precio con iva
		double iva = (double) sofa.precio*((double)sofa.iva/100);
		
		//deducimos el precio con iva 
		System.err.println(sofa.nombre + " - " + sofa.precio + " -  IVA : " + sofa.iva + " - PVP : " + (double)(sofa.precio + iva));
	}
}