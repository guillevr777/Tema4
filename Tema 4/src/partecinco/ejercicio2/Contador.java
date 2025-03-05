package partecinco.ejercicio2;

public class Contador {

	private int cont;
	
	public Contador (int cont) {
		this.cont = cont;
	}
	
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		if (cont != 0) {
		this.cont = cont;
		}
	}
	
//	public boolean mayor (Object obj) {
//		boolean esVerdad = false;
//		
//		return esVerdad;
//	}
	
	public void incrementar () {
		this.cont++;
	}
	
	public void decrementar () {
		if (cont > 0) {
			this.cont--;
		} else {
			this.cont = 0;
		}
	}
}
