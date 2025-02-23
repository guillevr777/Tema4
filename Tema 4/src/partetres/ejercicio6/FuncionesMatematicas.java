package partetres.ejercicio6;

public class FuncionesMatematicas {

	public static int sumatorio (int numero) {
		int numeros = 0;
		
		if (numero == 1) {
			numeros = 1;
		} else {
			numeros = numero + sumatorio(numero-1);
		}
		
		return numeros;
	}
	public static double potencia(double a, int n) {
		double numero = 0;
		
		if (n == 1) {
			numero = 1;
		} else {
			numero = a * potencia(a, n-1);
		}
		
		return numero;
	}
	public static int serieFibonacci(int numero) {
		int numeros = 0;
		
		if (numero == 0 || numero == 1) {
			numeros = 1;
		} else {
			numeros = serieFibonacci(numero-1) + serieFibonacci(numero-2);
		}
		
		return numeros;
	}
}
