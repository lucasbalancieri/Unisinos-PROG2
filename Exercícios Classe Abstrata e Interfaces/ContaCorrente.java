package classesAbstratasInterfaces;

public class ContaCorrente extends ContaBancaria{
	// Atributos
	private int qtdTransacoes;
	
	// Construtor
	public ContaCorrente(String senha) {
		super(senha);
		
	}
	
	// Métodos
	@Override
	public void saca(double valor) {
		this.setSaldo(getSaldo() - valor);
		qtdTransacoes++;
	}
	
	@Override
	public void deposita(double valor) {
		this.setSaldo(getSaldo() + valor);
		qtdTransacoes++;
	}
	
	@Override
	public void tiraExtrato() {
		System.out.println(this.toString());
		qtdTransacoes++;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente [quantTransacoes=" + qtdTransacoes+ ", toString()=" + super.toString() + "]";
	}
	
	// Getters and Setters
	public int getQtdTransacoes() {
		return qtdTransacoes;
	}

	public void setQtdTransacoes(int qtdTransacoes) {
		this.qtdTransacoes = qtdTransacoes;
	}
	
}
