package revisao;
// Revisão Classe
public class Universidade {
	//Atributos
	private String nome;
	private String endereco;
	private int qtdAlunos;
	private int qtdProfessores;
	
	//Construtor
	public Universidade(String nome, String endereco, int qtdAlunos, int qtdProfessores) {
		this.nome = nome;
		this.endereco = endereco;
		this.qtdAlunos = qtdAlunos;
		this.qtdProfessores = qtdProfessores;
	}
	
	//Métodos
	public String print(){
		return "Nome: " + this.nome 
				+ "\nEndereço: " + this.endereco
				+ "\nQuantidade de Alunos: " + this.qtdAlunos 
				+ "\nQuantidade de Professores: " + this.qtdProfessores;
	}
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	
	
	public int getQtdAlunos() {
		return qtdAlunos;
	}
	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
	
	public int getQtdProfessores() {
		return qtdProfessores;
	}
	public void setQtdProfessores(int qtdProfessores) {
		this.qtdProfessores = qtdProfessores;
	}
	
	
	
}
