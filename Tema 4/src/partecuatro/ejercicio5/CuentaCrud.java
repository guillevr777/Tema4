package partecuatro.ejercicio5;

import java.util.HashSet;
import java.util.Set;

import partecuatro.ejercicio4.Disco;
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
			verdad = true;
		} else {
			verdad = false;
		}
		return verdad;
	}
	static CuentaCorriente encontrar(String dni) {
		CuentaCorriente cuenta = null;
		for (CuentaCorriente c : cuentas) {
			if (c.getDni().equals(dni)) {
			cuenta = c;
			}
		}
		return cuenta;
	}
	public static boolean borrarCuenta(CuentaCorriente cuenta) {
		return cuentas.remove(cuenta);
	}
}
