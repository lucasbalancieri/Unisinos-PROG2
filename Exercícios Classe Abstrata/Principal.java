package classesabstratas;

public class Principal {

	public static void main(String[] args) {
		Figura retangulo = new Retangulo("azul", 5, 2);
		Figura circulo = new Circulo("rosa", 5);
		Figura triangulo = new Triangulo("vermelho", 5, 8, 4, 3);
		
		System.out.println(retangulo.cor +"\n"+ retangulo.calculaArea() +"\n"+ retangulo.calculaPerimetro()+"\n");
		System.out.println(circulo.cor +"\n"+ circulo.calculaArea() +"\n"+ circulo.calculaPerimetro()+"\n");
		System.out.println(triangulo.cor +"\n"+ triangulo.calculaArea() +"\n"+ triangulo.calculaPerimetro()+"\n");
		
	}

}
