package excecoes;

public class Principal {

	public static void main(String[] args) {
		ArCondicionado ar = new ArCondicionado();
		ArCondicionado ar2 = new ArCondicionado();
		
		System.out.println("::AR 1::");
		System.out.println("Temperatura Inicial: " + ar.getTemperaturaAtual());
		System.out.println("\nDiminuir 5 graus");
		ar.diminuiTemperatura(5);
		System.out.println(ar);
		
		System.out.println("\nDiminuir 4 graus");
		ar.diminuiTemperatura(4);
		System.out.println(ar);
		
		System.out.println("\nAumentar 50 graus");
		ar.aumentaTemperatura(50);
		System.out.println(ar);
		
		System.out.println("\nAumentar 15 graus");
		ar.aumentaTemperatura(15);
		System.out.println(ar);
		
		System.out.println("\n\n:: AR 2 ::");
		System.out.println("Temperatura Inicial: " + ar2.getTemperaturaAtual());
		System.out.println("\nDiminuir 5 graus");
		try {
			ar2.diminuiTemperaturaNoTreat(5);
		}catch(IllegalArgumentException e) {
			System.out.println("Erro: temperatura inválida.(min. 16°c)\nA temperatura foi mantida em "+ar2.getTemperaturaAtual());
		}
		System.out.println(ar2);
		
		System.out.println("\nDiminuir 4 graus");
		try {
			ar2.diminuiTemperaturaNoTreat(4);
		}catch(IllegalArgumentException e) {
			System.out.println("Erro: temperatura inválida.(min. 16°c)\nA temperatura foi mantida em "+ar2.getTemperaturaAtual());
		}
		System.out.println(ar2);
		
		System.out.println("\nAumentar 50 graus");
		try {
			ar2.aumentaTemperaturaNoTreat(50);
		}catch(IllegalArgumentException e) {
			System.out.println("Erro: temperatura inválida.(min. 16°c)\nA temperatura foi mantida em "+ar2.getTemperaturaAtual());
		}
		System.out.println(ar2);
		
		System.out.println("\nAumentar 15 graus");
		try {
			ar2.aumentaTemperaturaNoTreat(15);
		}catch(IllegalArgumentException e) {
			System.out.println("Erro: temperatura inválida.(min. 16°c)\nA temperatura foi mantida em "+ar2.getTemperaturaAtual());
		}
		System.out.println(ar2);
	}
}
