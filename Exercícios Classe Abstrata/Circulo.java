package classesabstratas;

public class Circulo extends Figura {
	public double raio;

	public Circulo(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	public double calculaArea() {
		return 3.14 * (this.raio * this.raio);
	}
	
	public double calculaPerimetro() {
		return 2 * 3.14 * this.raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
}
