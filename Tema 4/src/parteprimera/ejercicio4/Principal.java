package parteprimera.ejercicio4;

public class Principal {

	public static void main(String[] args) {

		//creamos dos objetos
		Pizza picha1 = new Pizza(19, "Mediana", "Margarita");
		Pizza picha2 = new Pizza(21, "Pequeña", "culo");
		
		//probamos los set y get
		System.out.println("Aqui vemos el tamaño, codigo y tipo de las dos pizzas");
		System.out.println("Pizza 1");
		System.out.println(picha1.toString());
		System.out.println("Pizza 2");
		System.out.println(picha2.toString());
		
		//Les asignamos un estado
		System.out.println("\nLe asignamos estados a las pizzas:");
		picha1.setEstado("Pedida");
		System.out.println("Pizza 1 : " + picha1.getEstado() );
		picha2.setEstado("Servida");
		System.out.println("Pizza 2 : " + picha2.getEstado() );
		
		//Comparamos si el codigo de la primera pizza es identico al de la segunda
		if (picha1.equals(picha2)) {
			System.out.println("\nAmbas pizzas tienen el mismo codigo");
		} else {
			System.out.println("\nLas pizzas tienen diferentes codigos ;(");
		}
		
		//Mostramos la informacion de ambas pizzas
		System.out.println("\n" + picha1.toString());
		System.out.println("\n" + picha2.toString());
	}
}
