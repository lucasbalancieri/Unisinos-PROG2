package classesAbstratasInterfaces;

public class ContaPoupanca extends ContaBancaria implements Rentavel {
	// Atributos
	private double taxaRendimento;
	
	// Construtor
	public ContaPoupanca(String senha) {
		super(senha);
		
	}
	//Métodos
	
	@Override
	public void saca(double valor) {
		this.setSaldo(getSaldo() - valor);
	}
	
	@Override
	public void deposita(double valor) {
		this.setSaldo(getSaldo() + valor);
	}
	
	@Override
	public void tiraExtrato() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "ContaPoupanca [taxaRendimento=" + taxaRendimento + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public double calculaRendimento() {
		return this.getSaldo() * this.getTaxaRendimento();
	}
	
	// Getters and Setters
	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}	
}
