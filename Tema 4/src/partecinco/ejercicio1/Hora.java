package partecinco.ejercicio1;

public class Hora {

	private int segundo;
	private int minuto;
	private int hora;
	
	//Constructores
	public Hora (int segundo) {
		this.segundo = segundo;
	}
	public Hora (int hora, int minuto, int segundo) {
		this.hora = hora;
	}
	
	//getters y setters
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
}
