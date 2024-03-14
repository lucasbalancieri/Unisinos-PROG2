package revisao;

public class Veiculo {
	private double velocidadeMax;
	private double preco;
	
	Veiculo(double velocidadeMax, double preco){
		this.velocidadeMax = velocidadeMax;
		this.preco = preco;
	}
	
	public String impremeInfo(){
		return "Velocidade Maxima: " + this.velocidadeMax
				+ "\nPreço: R$ " + this.preco;
	}
	public double getVelocidadeMax() {
		return velocidadeMax;
	}
	public void setVelocidadeMax(double velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
