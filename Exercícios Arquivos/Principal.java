package arquivos;

import java.io.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String filename;
		Estoque estoque = new Estoque();
		
		
		System.out.println("Arquivo: ");
		filename = scanner.nextLine();
		estoque.preencheEstoque(filename);
		
		Produtos[] produtos = estoque.getProdutos();
		
		// Encontra o Alimento mais caro
		double valorMaisCaro = 0;
		int posMaisCaro = 0;
		for(int i = 0; i < produtos.length; i++) {
			if(produtos[i] instanceof Alimento ) {
				if(produtos[i].getPreco() > valorMaisCaro) {
					valorMaisCaro = produtos[i].getPreco();
					posMaisCaro = i;
				}
			}
		}
		
		// Encontra o primeiro Eletrodoméstico;
		int firstEletro = -1;
		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] instanceof Eletrodomestico) {
				firstEletro = i;
				break;
			}
		}
		
		// Encontra o Eletrodomestico mais barato.
		double valorMaisBarato = produtos[firstEletro].getPreco();
		int posMaisBarato = 0;
		for (int i = 0; i < produtos.length; i++) {
			if(produtos[i] instanceof Eletrodomestico) {
				if(produtos[i].getPreco() < valorMaisBarato) {
					valorMaisBarato = produtos[i].getPreco();
					posMaisBarato = i;		
				}
			}
		}
		
		
		// Cria e escreve no arquivo info.txt
		try {
			File f = new File("info.txt");
			FileWriter fr = new FileWriter(f);
			PrintWriter out = new PrintWriter(fr);
			out.println("Alimento mais caro: " + produtos[posMaisCaro].getNome());
			out.println("Eletrodomêstico mais barato: " + produtos[posMaisBarato].getNome());
			for(Produtos produto: produtos) {
				if (produto instanceof Vestuario) {
					out.println(produto.getNome() + "	" + ((Vestuario) produto).getQtdEstoque());
				}
			}
			out.close();
		}catch(IOException ex) {
			System.out.println("Erro ao escrever o arquivo");
		}
		
		// Ler e mostrar arquivo info.txt
		filename = "info.txt";
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = in.readLine();
			}
			
			in.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo\""+filename+"\" não existe");
		}catch(IOException e) {
			System.out.println("Erro na leitura de"+filename+".");
		}
	
		scanner.close();
	}
}	



