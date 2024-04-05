package classesAbstratasInterfaces;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Exercícios 1, 2 e 3
		System.out.println("Exercícios 1, 2 e 3");
		int qtdContas;
		
		do{
			System.out.println("Quantas contas serão criadas? ");
			qtdContas = scanner.nextInt();
		}while(qtdContas <= 0);
		
		// Cria contas
		ContaBancaria[] contas = new ContaBancaria[qtdContas];
		for (int i = 0; i < contas.length; i++) {
			System.out.println("Tipo da conta: \n1 - CC \n2 - CP");
			int tipo = scanner.nextInt();
			if(tipo == 1) {
				contas[i] = new ContaCorrente("passpadrão");
			}else if (tipo == 2) {
				contas[i] = new ContaPoupanca("passpadrão");
			}
		}
		
		// Define numoro da conta;
		for (int i = 0; i < contas.length; i++) {
			contas[i].setNumero((int)(Math.random()*10000+1));
		}
		// Operações nas contas
		for (int i = 0; i < contas.length; i++) {
			contas[i].deposita(Math.random()*500);
			contas[i].saca(Math.random()*100);
			contas[i].tiraExtrato();
		}
		// Define taxa de rendimento
		System.out.println("\nDefinindo taxa de rendimento");
		for (int i = 0; i < contas.length; i++) {
			ContaBancaria conta = contas[i];
			if(conta instanceof ContaPoupanca) {
				((ContaPoupanca) conta).setTaxaRendimento(Math.random() + 1);
			}
		}
		
		// Imprime contas
		for (int i = 0; i < contas.length; i++) {
			ContaBancaria conta = contas[i];
			if(conta instanceof ContaPoupanca) {
				System.out.println("\nConta: " + conta.getNumero() +"\nTaxa de Rendimento: " + ((ContaPoupanca) conta).getTaxaRendimento());
			}else if (conta instanceof ContaCorrente) {
				System.out.println("\nConta: " + conta.getNumero() + "\nNúmero de Transações: " + ((ContaCorrente) conta).getQtdTransacoes());
			}
		}
		
		// Exercicio 4 e 5
		System.out.println("\nExercícios 4 e 5");
		
		// Calcula rendimento através da interface
		Rentavel[] rentaveis = new Rentavel[(int)(Math.random()*10+1)];
		
		for(int i=0; i<rentaveis.length; i++) {
			rentaveis[i] = Math.random() < 0.5 ? new ContaPoupanca("123456") : new TesouroDireto(Math.random()*500);
		}
		
		// Imprime Rendimentos
		System.out.println("\nRendimentos:");
		for(int i=0; i<rentaveis.length; i++)
			System.out.println(rentaveis[i].calculaRendimento());

	}
}

