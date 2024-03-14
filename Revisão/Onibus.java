package revisao;

public class Onibus extends Veiculo {
	public int capacidade;
	
	Onibus(double velocidadeMax, double preco, int capacidade){
		super(velocidadeMax, preco);
		this.capacidade = capacidade;
	}
	
	@Override
	public String impremeInfo(){
		return "\nVelocidade Maxima: " + super.getVelocidadeMax()
				+ "\nPreço: R$ " + super.getPreco()
				+ "\nAno Fabricação: " + this.capacidade;
	}
	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	
}
