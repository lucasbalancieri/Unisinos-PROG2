package classesabstratas;

public class Retangulo extends Figura {
	public double base;
	public double altura;
	
	public Retangulo(String cor, double base, double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calculaArea() {
		return this.base * this.altura;
	}
	
	@Override
	public double calculaPerimetro() {
		return (this.base * this.altura) * 2;
	}
	
	public double getBase() {
		return this.base;
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
	
}
