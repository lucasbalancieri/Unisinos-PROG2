package arquivos;

import java.io.*;

public class Estoque {
	// Atributos
	private Produtos[] produtos;
	
	// Construtor
	Estoque(){
		
	}
		
	public void preencheEstoque(String filename) {
		try {
			// Verifica quantidade de linhas do arquivo;
			FileReader fr = new FileReader(filename);
			BufferedReader in = new BufferedReader(fr);
			long qtdLinhas = in.lines().count();
			System.out.println("qtdLinha: " + qtdLinhas);
			in.close();
			
			// Preenche o array produtos
			fr = new FileReader(filename);
			in = new BufferedReader(fr);
			in.readLine();
			this.produtos = new Produtos[(int) (qtdLinhas-1)];
			
			for(int i = 0; i < produtos.length; i++) {
				String line = in.readLine();
				// Separa linhas e armazena em variáveis
				String[] linhaSeparada = line.split("\\s\\*\\s");
				String produto = linhaSeparada[0];
				String descricao = linhaSeparada[1];
				double preco = Double.parseDouble(linhaSeparada[2]);
				
				// Instancia e armazena os objetos no array de acordo com o tipo
				if(linhaSeparada[3].equalsIgnoreCase("Alimento")){
					String dataValidade = linhaSeparada[4];
					produtos[i] = new Alimento(produto, descricao, preco, dataValidade);
				}else if (linhaSeparada[3].equalsIgnoreCase("Vestuario")) {
					int qtdEstoque = Integer.parseInt(linhaSeparada[4]);
					produtos[i] = new Vestuario(produto, descricao, preco, qtdEstoque);
				}else if(linhaSeparada[3].equalsIgnoreCase("Eletrodomestico")) {
					double ipi = Double.parseDouble(linhaSeparada[4]);
					produtos[i] = new Eletrodomestico(produto, descricao, preco, ipi);
				}				
			}
			
			in.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("O arquivo \"" + filename + "\" não existe");
		}catch(IOException e) {
			System.out.println("Erro na leitura de " + filename + ".");
		}
	}
	
	//Getters and Setters
	public Produtos[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produtos produtos[]) {
		this.produtos = produtos;
	}
	
}
