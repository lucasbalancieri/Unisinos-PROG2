package revisao;
//Revisão Polimorfismo 
public class TesteVeiculo {

	public static void main(String[] args) {
		//Veiculo 1
		Veiculo v = new Carro(180, 25000, 2008);
		
		System.out.println(v.impremeInfo());
		
		((Carro) v).setAnoFabricacao(2000); //cast transforma v em Carro
		
		System.out.println(((Carro) v).getAnoFabricacao()); //cast transforma v em Carro
		
		
		//Veiculo 2
		Veiculo v2 = new Onibus(100, 40000, 1990);
		
		System.out.println(v2.impremeInfo());
		
		((Onibus) v2).setCapacidade(40); //cast transforma v2 em Onibus
		
		System.out.println(((Onibus) v2).getCapacidade()); //cast transforma v2 em Onibus
	}

}
