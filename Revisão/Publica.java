package revisao;
//Revisão Herança
public class Publica extends Universidade {
	//Atributos
	private int qtdConcursados;
	
	//Construtor
	Publica(String nome, String endereco, int qtdAlunos, int qtdProfessores, int qtdConcursados){
		super(nome, endereco, qtdAlunos, qtdProfessores);
		this.qtdConcursados = qtdConcursados;
	}
	
	//Métodos
	@Override
	public String print(){
		return "Nome: " + super.getNome() 
				+ "\nEndereço: " + super.getEndereco()
				+ "\nQuantidade de Alunos: " + super.getQtdAlunos()
				+ "\nQuantidade de Professores: " + super.getQtdProfessores()
				+ "\nQuantidade Professores Concursados: " + this.qtdConcursados;
	}
	
	//Getters and Setters
	public int getQtdConcursados() {
		return this.qtdConcursados;
	}
	
	public void setQtdConcursados(int qtdConcursados) {
		this.qtdConcursados = qtdConcursados;
	}
}
