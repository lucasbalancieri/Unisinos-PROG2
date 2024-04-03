package excecoes;

public class ArCondicionado {
	// Atributos
	private double temperaturaAtual;
	
	// Construtor
	public ArCondicionado() {
		this.temperaturaAtual = 20;
	}
	// Métodos
	
	// diminuiTemperatura com exceção tratada dentro do método;
	public void diminuiTemperatura(double tempMenos){
	    try {
	    	this.temperaturaAtual -= tempMenos;
		     if (this.temperaturaAtual < 16) {
		    	 throw new IllegalArgumentException();
		     }
	    } catch(IllegalArgumentException e) {
	    	this.temperaturaAtual += tempMenos;
	    	System.out.println("Erro: temperatura inválida.(min. 16°c)\nA temperatura foi mantida em "+this.temperaturaAtual);
	    }
	}
	
	// aumentaTemperatura com exceção tratada dentro do método;
	public void aumentaTemperatura(double tempMais){
		try {
			this.temperaturaAtual += tempMais;
			if (this.temperaturaAtual > 32) {
				throw new IllegalArgumentException();
			}
		}catch(IllegalArgumentException e) {
			this.temperaturaAtual -= tempMais;
			System.out.println("Erro: temperatura inválida. (máx. 32°c)\nA temperatura foi mantida em "+this.temperaturaAtual);
		}
		
	}

	// diminuiTemperatura com exceção lançada mas não tratada dentro do método;
	public void diminuiTemperaturaNoTreat(double tempMenos) throws IllegalArgumentException{
    	this.temperaturaAtual -= tempMenos;
	     if (this.temperaturaAtual < 16) {
	    	 this.temperaturaAtual += tempMenos;
	    	 throw new IllegalArgumentException();
	     }
	}
	
	// aumentaTemperatura com exceção lançada mas não tratada dentro do método;
	public void aumentaTemperaturaNoTreat(double tempMais) throws IllegalArgumentException{
		this.temperaturaAtual += tempMais;
		if (this.temperaturaAtual > 32) {
			this.temperaturaAtual -= tempMais;
			throw new IllegalArgumentException();
		}
	}
	@Override
	public String toString() {
		return "ArCondicionado [temperaturaAtual=" + temperaturaAtual + "]";
	}
	// Getters and Setters
	public double getTemperaturaAtual() {
		return temperaturaAtual;
	}

	public void setTemperaturaAtual(double temperaturaAtual) {
		this.temperaturaAtual = temperaturaAtual;
	}
}
