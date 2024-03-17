package classesabstratas;

public class Triangulo extends Figura {
	public double base;
	public double altura;
	public double ladoA;
	public double ladoB;
	
	public Triangulo(String cor, double base, double altura, double ladoA, double ladoB) {
		super(cor);
		this.base = base;
		this.altura = altura;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	public double calculaArea() {
		return (this.base * this.altura) / 2;
	}
	
	public double calculaPerimetro() {
		return this.base + this.ladoA + this.ladoB;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
}
