package partecinco.ejercicio4;

public class Principal {

	public static void main(String[]args) {
		
		Fraccion primera = new Fraccion(2,2);
		Fraccion segunda = new Fraccion(3,6);

		Fraccion resultadoMultiplicacion = primera.multiplica(segunda);
		System.out.println("Multiplicacion: " + resultadoMultiplicacion);
	}
}