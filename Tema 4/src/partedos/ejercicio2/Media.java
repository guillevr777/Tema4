package partedos.ejercicio2;

public class Media {
	
	public double Media (int numeroUno, int numeroDos, int numeroTres) {
		double media;
		
		media = (numeroUno + numeroDos + numeroTres) / 3;
		
		return media;
	}
	public double Media (int numeroUno, int numeroDos) {
		double media;
		
		media = (numeroUno + numeroDos) / 2;
		
		return media;
	}
}	
