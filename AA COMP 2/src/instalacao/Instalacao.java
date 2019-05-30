package instalacao;

import java.util.Arrays;
import java.util.List;

import animal.Animal;

public abstract class Instalacao {
	
	public enum Localizacao{
		 NORTE, SUL, LESTE, OESTE, NORDESTE,
		 NOROESTE, SULDESTE, SULDOESTE, CENTROESTE;
	}
	
	private int capacidadeMaxima;
	private Localizacao localizacao;
	private double temperatura;
	private Animal[] animaisInstalados;
	private List<ElementoInstalacao> elementoInstalacao;
	

	public Instalacao(){};
	
	public Instalacao(int capacidadeMaxima, Localizacao localizacao, double temperatura, List<ElementoInstalacao> elementoInstalacao) {
		this.capacidadeMaxima = capacidadeMaxima;
		this.localizacao = localizacao;
		this.temperatura = temperatura;
		this.animaisInstalados = new Animal[capacidadeMaxima];
		this.elementoInstalacao = elementoInstalacao;
	}
	
	
	public boolean instalaAnimal(Animal animal, int posicao){
		
		if(!(this.getClass().getSimpleName().contains(animal.getClass().getSimpleName()))){
			System.out.println("Nao e possivel inserir um objeto "+animal.getClass().getSimpleName()
					+" em uma "+this.getClass().getSimpleName()+"!!!");
			return false;
		}
		
		try{
			if(this.animaisInstalados[posicao] == null){
				this.animaisInstalados[posicao] = animal;
				System.out.println(animal.getClass().getSimpleName()+" inserido na posicao "+posicao);
				
			}else{
				System.out.println("Ja possui um animal na posicao "+posicao+"!");
				return false;
			}
			
			return true;				
		}catch(Exception e){			
			System.out.println("Posicao "+posicao+" fora do limite da instalacao, tente uma posicao menor que "+capacidadeMaxima+"!!!");
			return false;
		}
	}

	public Animal[] getAnimaisInstalados() {
		return animaisInstalados;
	}

	public void setAnimaisInstalados(Animal[] animaisInstalados) {
		this.animaisInstalados = animaisInstalados;
	}

	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public List<ElementoInstalacao> getElementoInstalacao() {
		return elementoInstalacao;
	}

	public void setElementoInstalacao(List<ElementoInstalacao> elementoInstalacao) {
		this.elementoInstalacao = elementoInstalacao;
	}

	@Override
	public String toString() {
		return  this.getClass().getSimpleName()+" [capacidadeMaxima=" + capacidadeMaxima + ", localizacao=" + localizacao + ", temperatura="
				+ temperatura + ", animaisInstalados=" + Arrays.toString(animaisInstalados) + ", elementoInstalacao="
				+ elementoInstalacao + "]";
	}
	
	
}
