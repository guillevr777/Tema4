package partecinco.ejercicio4;

public class Fraccion {

	private int numerador;
	private int denominador;
	
	public Fraccion (int a, int b) {
		this.numerador = a;
		this.denominador = b;
	}

	public int getA() {
		return numerador;
	}

	public void setA(int a) {
		this.numerador = a;
	}

	public int getB() {
		return denominador;
	}

	public void setB(int b) {
		this.denominador = b;
	}
	
	// Método para calcular el MCD
    private int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
    
	// Método para simplificar la fracción
    private void simplifica() {
        int mcd = mcd(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
    }

    // Método para sumar fracciones
    public Fraccion suma(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.denominador + otra.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    // Método para restar fracciones
    public Fraccion resta(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.denominador - otra.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    // Método para multiplicar fracciones
    public Fraccion multiplica(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.numerador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    // Método para dividir fracciones
    public Fraccion divide(Fraccion otra) {
        if (otra.numerador == 0) {
            throw new ArithmeticException("No se puede dividir por una fracción con numerador 0");
        }
        int nuevoNumerador = this.numerador * otra.denominador;
        int nuevoDenominador = this.denominador * otra.numerador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public String toString() {
    	return this.numerador + "/" + this.denominador;
    }
}
