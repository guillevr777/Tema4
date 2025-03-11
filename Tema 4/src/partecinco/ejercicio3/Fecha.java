package partecinco.ejercicio3;

public class Fecha {

	private int dia;
	private int mes;
	private int año;
	
	public Fecha (int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	public boolean esBisiesto (int año) {
		boolean esReal = false;
		if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
			esReal = true;
		}
		return esReal;
	}
	
	public boolean esCorrecta (int dia, int mes, int año) {
		boolean esReal = false;
		if (this.esBisiesto(año) && dia > 0 && mes < 12) {
			esReal = true;
		}
		return esReal;
	}
	
	 public void diaSiguiente() {

	        this.dia++;
	        if (this.dia > 30) {
	        	this.dia = 1;
	        	this.mes++;
	        }
	        if (this.mes > 12) {
	        	this.mes = 1;
	        	this.año++;
	        }
	    }
	
	@Override
	public String toString() {
		return this.dia + " - " + this.mes + " - " + this.año;
	}
}