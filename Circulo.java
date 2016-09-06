package ar.edu.unlam.tp1;

public class Circulo {
	private Double radio;
	private Double perimetro;
	public Circulo(Double radio){
		this.setRadio(radio);
	}
	
	public Double getRadio() {
		return radio;
	}
	public void setRadio(Double radio) {
		this.radio = radio;
	}

	public Double getPerimetro() {
		perimetro = this.radio*3.1416*2;
		return perimetro;
	}

	public void setPerimetro(Double perimetro) {
		this.perimetro = perimetro;
	}

}
