package partetres.ejercicio3;

public class SumaEnteros {

	public int SumaEnteros (int numero) {
		int SumaEnteros;
		
		if (numero == 1) {
			SumaEnteros = 1;
		} else {
		SumaEnteros = numero + SumaEnteros(numero-1);
		}
		
		return SumaEnteros;
	}
	public int SumaEnteros (int numeroUno, int numeroDos) {
		int SumaEnteros;
		
		if (numeroUno == numeroDos) {
			SumaEnteros = 0;
		} else {
			SumaEnteros = numeroUno + SumaEnteros(numeroUno-1, numeroDos);
		}
		
		return SumaEnteros;
	}
}
