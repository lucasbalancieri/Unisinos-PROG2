package revisao;

public class Teste {
	public static void main(String[] args) {
		Universidade uniPublica = new Publica("Uniballack", "Rua1", 150, 7, 10);
		Privada uniPrivada = new Privada("Uniballackinho", "Rua2", 150, 7, 430.00);
		
		System.out.println(uniPublica.print());
		System.out.println("\n" + uniPrivada.print());
		uniPrivada.incrementoMensalidade(50.00);
		System.out.println("\n" + uniPrivada.print());
		System.out.println(uniPrivada.getMensalidade());
		/*
		System.out.println(uni.print());
		
		System.out.println(uni.getNome());
		System.out.println(uni.getQtdAlunos());
		System.out.println(uni.getQtdProfessores());
		*/
		
	}

}
