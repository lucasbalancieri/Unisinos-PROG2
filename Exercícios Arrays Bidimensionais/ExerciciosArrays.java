package arrays;
import java.util.Random;
import java.util.Scanner;


public class ExerciciosArrays {
	/*Exercício 1a
	 * Crie um método chamado exercicio1a, que retorna o array de inteiros abaixo:
		0 1 2 3 4 5 6 7 8 9
		0 1 2 3 4 5 6 7 8 9
		0 1 2 3 4 5 6 7 8 9*/
	
	public int[][] exercicio1a(){
		int[][] array = new int [3][10];
		for (int i=0; i < array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = j;
			}
		}
		return array;
	}
	
	/*Exercício 1b
	 * Crie um método chamado exercicio1b, que retorna o array de inteiros abaixo:
		0 1 4 9 16 25 36 49 64 81
		0 1 4 9 16 25 36 49 64 81
		0 1 4 9 16 25 36 49 64 81
		0 1 4 9 16 25 36 49 64 81
		0 1 4 9 16 25 36 49 64 81*/
	
	public int[][] exercicio1b(){
		int[][] array = new int[5][10];
		for(int i=0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = j * j;
			}
			
		}
		return array;
	}
	
	/*Exercício 1c
	 * Crie um método chamado exercicio1c, que retorna o array de inteiros abaixo:
	 	0 0 0 0 0 0
		1 1 1 1 1 1
		2 2 2 2 2 2
		3 3 3 3 3 3
		4 4 4 4 4 4
		5 5 5 5 5 5*/
	
	public int [][] exercicio1c(){
		int[][] array = new int[6][6];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = i;
			}
		}
		return array;
	}
	
	/*Exercício 1d
	 * Crie um método chamado exercicio1d, que retorna o array de inteiros abaixo:
	 	-1 -1 -1 -1 -1 -1
		 0  0  0  0  0  0
		-1 -1 -1 -1 -1 -1
		 0  0  0  0  0  0
		-1 -1 -1 -1 -1 -1
		 0  0  0  0  0  0
		-1 -1 -1 -1 -1 -1
		 0  0  0  0  0  0
		-1 -1 -1 -1 -1 -1*/
	
	public int[][] exercicio1d(){
		int [][] array = new int[9][6];
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = (i%2==0) ? -1 : 0;
			}
		}
		return array;	
	}
	
	/*Exercício 2
	 * Crie um método que retorna uma matriz de inteiros com números aleatórios positivos menores que 100. 
	 * O tamanho da matriz deve ser solicitado pelo teclado dentro do método.*/
	
	public int[][] exercicio2(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite linhas: ");
		int linhas = Integer.parseInt(scanner.next());
		
		System.out.println("Digite colunas: ");
		int colunas = Integer.parseInt(scanner.next());
		
		int [][] array = new int[linhas][colunas];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = new Random().nextInt(100);
			}
		}
		
		//scanner.close();
		return array;
	}	
	
	/*Exercício 3
	 * Escreva um método que leia 10 valores double do teclado e armazene-os em uma matriz de dimensões 2x5. 
	 * Seu método deve retornar esta matriz.*/
	
	public double [][] exercicio3(){
		Scanner scanner = new Scanner(System.in);

		double [][] array = new double [2][5];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Digite o próximo valor (double):");
				array[i][j] = Double.parseDouble(scanner.next());
			}
		}
		
		//scanner.close();
		return array;
	}
	
	/*Exercício 4 e 5
	 * Crie um método que recebe um array bidimensional de double e 
	 * retorna a quantidade de elementos deste array.*/
	
	public int exercicio4e5(double[][] array){
		int colunas = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				colunas++;
			}
		}
		return colunas;
	}
	
	/*Exercício 6
	 * Crie um método que recebe uma matriz de double e retorna um String de saída para ela, 
	 * com seus valores separados por um hífen, mas mantendo o formato da matriz.*/
	
	public String exercicio6(double[][] array) {
		String retorno = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				retorno += (j == array[i].length-1) ? array[i][j] + "\n" : array[i][j]+ " - ";
			}
		}
		return retorno;
	}
	
	/*Exercício 7
	 * Crie um método que recebe uma matriz de double e retorna o maior valor da matriz.*/
	
	public double exercicio7(double[][] array) {
		double aux = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				aux = (array[i][j] > aux) ? aux = array[i][j] : aux;
			}
		}
		
		return aux;
	}
	
	/*Exercício 8
	 * Crie um método que recebe uma matriz de inteiros e retorna a soma de todos os elementos da matriz.*/
	
	public int exercicio8(int[][] array) {
		int soma = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				soma += array[i][j];
			}
		} 
		
		return soma;
	}
	
	/*Exercício 9: Crie um método que recebe um array bidimensional de double e 
	 * retorna a média dos valores deste array.*/
	public double exercicio9(double[][] array) {
		double soma = 0;
		double elementos = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				soma += array[i][j];
				elementos++;
			}
		} 
		
		return soma/elementos;
	}

	/* Exercício 10
	 * Crie um método que devolve uma matriz de caracteres lidos do teclado. O
	 * número de linhas da matriz deve ser aleatório, entre 1 e 5, 
	 * enquanto o número de colunas deve ser também aleatório, porém, entre 1 e 3.*/
	
	public char[][] exercicio10(){
		Scanner scanner = new Scanner(System.in);
		
		int linhas = (int)(Math.random()*5+1);
		int colunas = (int)(Math.random()*3+1);
		
		char[][] array = new char[linhas][colunas];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println("Digite o próximo valor (char):");
				array[i][j] = scanner.next().charAt(0);
			}
			
		}

		//scanner.close();
		return array;
	}
	
	/* Exercício 11
	 * Crie um método que recebe uma matriz de inteiros e retorna um array unidimensional 
	 * que contém apenas os elementos positivos desta matriz.*/
	
	public int[] exercicio11(int[][] array) {
		int[] uni = new int[array.length * array.length];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				uni[count++] = array[i][j];
			}
		}
		return uni;
	}
	
	/*Métodos para Impressão*/
	public void imprimeArrayUnidimentsional(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public void imprimeArrayBidimensional(int[][] array){
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[i].length; j++)
				System.out.print(array[i][j]+" ");
			System.out.println();
		}
		System.out.println();
	}
	
	public void imprimeArrayBidimensional(double[][] array){
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[i].length; j++)
				System.out.print(array[i][j]+" ");
			System.out.println();
		}
		System.out.println();
	}
	
	public void imprimeArrayBidimensional(char[][] array){
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[i].length; j++)
				System.out.print(array[i][j]+" ");
			System.out.println();
		}
		System.out.println();
	}
	
}











