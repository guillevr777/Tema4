package parte1.ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		//Primera clase
		Punto numero1 = new Punto();
		
		//Segunda clase
		Punto numero2 = new Punto();
		
		//Tercera clase
		Punto numero3 = new Punto();
		
		//asignamos valores a 
		numero1.x = 5;
		numero1.y = 0;
		
		//mostramos las cooredenadas
		System.out.println(numero1.x +  "," + numero1.y);
		
		//asignamos valores a 
		numero2.x = 10;
		numero2.y = 10;
		
		//mostramos las cooredenadas
		System.out.println(numero2.x +  "," + numero2.y);
		
		//asignamos valores a 
		numero3.x = -3;
		numero3.y = 7;
		
		//mostramos las cooredenadas
		System.out.println(numero3.x +  "," + numero3.y);

		System.out.println(numero1.x * numero3.x + "," + numero2.y + numero3.y);
	}
}
