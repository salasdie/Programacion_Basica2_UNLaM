package ar.edu.unlam.tp1;

public class Circulo {
	private static final double PI = 3.14;
	
	private double radio;
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double calcularPerimetro(){
		
        double perimetro=0.00;
		
		perimetro = 2*PI*getRadio();
		
		return perimetro;
		
	}

	

}
