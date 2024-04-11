package arquivos;

public class Vestuario extends Produtos {
	private int qtdEstoque;
	
	Vestuario(String nome, String descricao, double preco, int qtdEstoque){
		super(nome, descricao, preco);
		this.setQtdEstoque(qtdEstoque);
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	
}
