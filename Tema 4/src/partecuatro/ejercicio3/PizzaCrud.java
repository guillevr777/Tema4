package partecuatro.ejercicio3;

import java.util.HashSet;
import java.util.Set;

import partecuatro.ejercicio3.Pizza;
import partecuatro.ejercicio3.Principal;

public class PizzaCrud {

	// Atributo que va a ser la coleccion donde almacenar nuestros objetos
	private static Set<Pizza> pizzas = new HashSet<Pizza>();
	
	static void listadoPizza () {		
		for (Pizza p : pizzas) {
			System.out.println(p);
			System.out.println("--------------");
		}
	}
	
	//preguntar si tiene que ser void o boolean
	static void listarPizza (int codigo, String tamaño, String tipo) {		
		Pizza pizza = new Pizza(codigo, tamaño, tipo);
		if (pizzas.add(pizza)) {
			System.out.println("Creado exitosamente.");
		} else {
			System.out.println("Ocurrio un problema con su solicitud.");
		}
	}
	
	public static Pizza buscaPizza(int codigo) {
		
		Pizza pizza = null;
		
		for (Pizza p : pizzas) {
			if (p.getCodigo() == codigo) {
				pizza = p;
			}
		}
		return pizza;
	} 
	
	static boolean servida (int codigo, String estado) {
		boolean esVerda;
		Pizza pizza = buscaPizza(codigo);
		if (pizza != null) {
			pizza.setEstado(estado);
			esVerda = true;
		} else {
			esVerda = false;
		}
		return esVerda;
	}
}
