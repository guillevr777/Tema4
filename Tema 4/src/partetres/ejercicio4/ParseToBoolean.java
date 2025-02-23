package partetres.ejercicio4;

public class ParseToBoolean {

	public static boolean parseToBoolean (int numero) {
		boolean acierto = false;
		
		if (numero == 0) {
			acierto = false;
		} else if (numero == 1) {
			acierto = true;
		}
		
		return acierto;
	}
	public static boolean parseToBoolean (String frase) {
		boolean acierto = false;
		
		if (frase.equals("false")) {
			acierto = false;
		} else if (frase.equals("true")) {
			acierto = true;
		}
		
		return acierto;
	}
}
