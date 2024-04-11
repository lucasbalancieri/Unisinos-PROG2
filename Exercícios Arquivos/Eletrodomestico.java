package arquivos;

public class Eletrodomestico extends Produtos{
	private double ipi;
	
	Eletrodomestico(String nome, String descricao, double preco, double ipi){
		super(nome, descricao, preco);
		this.setIpi(ipi);
	}
	
	public double getIpi() {
		return ipi;
	}

	public void setIpi(double ipi) {
		this.ipi = ipi;
	}

}
