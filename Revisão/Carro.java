package revisao;

public class Carro extends Veiculo {
	public int anoFabricacao;
	
	Carro(double velocidadeMax, double preco, int anoFabricacao){
		super(velocidadeMax, preco);
		this.anoFabricacao = anoFabricacao;
	}
	
	@Override
	public String impremeInfo(){
		return "Velocidade Maxima: " + super.getVelocidadeMax()
				+ "\nPreço: R$ " + super.getPreco()
				+ "\nAno Fabricação: " + this.anoFabricacao;
	}
	
	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
}
