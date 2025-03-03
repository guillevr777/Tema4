package partecuatro.ejercicio5;

import java.util.HashSet;
import java.util.Set;

import partecuatro.ejercicio5.CuentaCorriente;

public class CuentaCrud {
		
	// Atributo que va a ser la coleccion donde almacenar nuestros objetos
	private static Set<CuentaCorriente> cuentas = new HashSet<CuentaCorriente>();
	
	static void listado () {
		for (CuentaCorriente c : cuentas) {
			System.out.println(c);
			System.out.println("-----------------------");
		}
	}
	static boolean crearCuenta (String dni, String nombre, int saldoInicial) {
		boolean verdad;
		CuentaCorriente cuenta = new CuentaCorriente(dni, nombre, saldoInicial);
		if (cuentas.add(cuenta)) {
			System.out.println("Operacion exitosa.");
			verdad = true;
		} else {
			System.out.println("Hubo algun problema con su operacion.");
			verdad = false;
		}
		return verdad;
	}
}
