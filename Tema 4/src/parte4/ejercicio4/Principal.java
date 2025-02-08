package parte4.ejercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//llamamos al metodo Scanner
		Scanner reader = new Scanner(System.in);

		// declaramos variables para guardar temporalemnte los datos
		int cantidad;
		String nombre;
		double IVA;
		int precio;
		double precioIva;
		
		// asignamos valores a sofa
		cantidad = 13;
		nombre = "PremierDelux";
		IVA = 21;
		precio = 356;

		// llamamos al metodo sofa
		Articulo sofa = new Articulo(nombre, precio, IVA, precioIva , cantidad);
		
		System.out.println(sofa.toString());
		
		//preguntamos por mas stock
		System.out.println("Quieres añadir mas stock? Sofas : " + sofa.getCantidad());
		sofa.almacenar(reader.nextInt());
		
		System.out.println("Apllicale un descuento:");
		sofa.getPVPDescuento(reader.nextInt());

		// deducimos el precio con iva
		System.out.println(sofa.toString());
	}
}