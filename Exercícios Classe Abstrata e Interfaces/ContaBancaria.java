package classesAbstratasInterfaces;

import java.util.Scanner;

public abstract class ContaBancaria{
	//Atributos
	private String senha;
	private int numero;
	private double saldo;
	
	// Construtores
	public ContaBancaria(String senha) {
		this.senha = senha;
	}
	
	public ContaBancaria(String senha, int numero, double saldo) {
		this.senha = senha;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	// Métodos
	public abstract void saca(double valor);
	
	public abstract void deposita(double valor);
	
	public abstract void tiraExtrato();
	
	public boolean alteraSenha(String novaSenha) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Digite a senha atual");
			if(scanner.nextLine().equals(this.senha)) {
				System.out.println("Senha alterada com sucesso");
				this.senha = novaSenha;
				return true;	
			}else{
				System.out.println("Senha incorreta");
				return false;
			} 
		}finally{
			scanner.close();
		}
	}
	
	@Override
	public String toString() {
		return "ContaBancaria [senha=" + senha + ", numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	//Getters and Setters
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
