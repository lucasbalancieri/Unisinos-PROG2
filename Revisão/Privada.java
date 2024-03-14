package revisao;
//Revisão Herança
public class Privada extends Universidade{
	//Atributos
	private double mensalidade;
	
	//Construtor
	Privada(String nome, String endereco, int qtdAlunos, int qtdProfessores, double mensalidade){
		super(nome, endereco, qtdAlunos, qtdProfessores);
		this.mensalidade = mensalidade;
	}
	//Métodos
	public String print(){
		return "Nome: " + super.getNome() 
				+ "\nEndereço: " + super.getEndereco()
				+ "\nQuantidade de Alunos: " + super.getQtdAlunos()
				+ "\nQuantidade de Professores: " + super.getQtdProfessores()
				+ "\nMensalidade: " + this.mensalidade;
	}
	
	public double incrementoMensalidade(double incremento) {
		return this.mensalidade = mensalidade + incremento;
	}
	
	//Getters and Setters
	public double getMensalidade() {
		return this.mensalidade;
	}
	
	public void setMensalidade (double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	

}
