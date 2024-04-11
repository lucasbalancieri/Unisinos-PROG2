package arquivos;

public class Alimento extends Produtos{
	private String validade;
	
	Alimento(String nome, String descricao, double preco, String validade){
		super(nome, descricao, preco);
		this.validade = validade;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}
	
}
