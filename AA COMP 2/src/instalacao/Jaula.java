package instalacao;

public class Jaula extends ElementoInstalacao{
	double altura;
	double largura;
	double comprimento;
	
	
	public Jaula(double altura, double largura, double comprimento) {
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
	}



	public double area(){
		return altura*largura*comprimento;
	}



	public double getAltura() {
		return altura;
	}



	public double getLargura() {
		return largura;
	}



	public double getComprimento() {
		return comprimento;
	}



	@Override
	public String toString() {
		return "Jaula [altura=" + altura + ", largura=" + largura + ", comprimento=" + comprimento + "]";
	}
	
	
}
