package arrays;

public class Principal {

	public static void main(String[] args) {
		ExerciciosArrays ex = new ExerciciosArrays();
		double [][] arrayDoubleBi = {{4, 3, 5}, {2, 1, 6}, {9, 8, 7}};
		int [][] arrayIntBi = {{4, 3, 2}, {2, 1, 5}, {9, 8, 7}};
		
		System.out.println("Exercício 1a");
		ex.imprimeArrayBidimensional(ex.exercicio1a());
		System.out.println("Exercício 1b");
		ex.imprimeArrayBidimensional(ex.exercicio1b());
		System.out.println("Exercício 1c");
		ex.imprimeArrayBidimensional(ex.exercicio1c());
		System.out.println("Exercício 1d");
		ex.imprimeArrayBidimensional(ex.exercicio1d());
		System.out.println("Exercício 2");
		ex.imprimeArrayBidimensional(ex.exercicio2());
		System.out.println("Exercício 3");
		ex.imprimeArrayBidimensional(ex.exercicio3());
		System.out.println("Exercício 4 e 5");
		System.out.println(ex.exercicio4e5(arrayDoubleBi) + "\n");
		System.out.println("Exercício 6");
		System.out.println(ex.exercicio6(arrayDoubleBi) + "\n");
		System.out.println("Exercício 7");
		System.out.println(ex.exercicio7(arrayDoubleBi) + "\n");
		System.out.println("Exercício 8");
		System.out.println(ex.exercicio8(arrayIntBi) + "\n");
		System.out.println("Exercício 9");
		System.out.println(ex.exercicio9(arrayDoubleBi) + "\n");
		System.out.println("Exercício 10");
		ex.imprimeArrayBidimensional(ex.exercicio10());
		System.out.println("Exercício 11");
		ex.imprimeArrayUnidimentsional(ex.exercicio11(arrayIntBi));
	}
}
