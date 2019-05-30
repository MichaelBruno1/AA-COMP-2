package animal.animais;

import animal.Anfibio;
import animal.Aquatico;
import animal.Terrestre;

public class Tartaruga implements Anfibio{

	private Sexo sexo;
	private Porte porte;
	
	
	public Tartaruga(Sexo sexo) {
		this.sexo = sexo;
		this.porte = Porte.PEQUENO;
	}

	@Override
	public boolean alimentar(Alimento alimento) {
		if(alimento.equals(Alimento.VERDURAS) || alimento.equals(Alimento.FRUTAS) || alimento.equals(Alimento.PEIXES)){
			System.out.println("Tartaruga alimentada com "+alimento+"!");
			return true;
		}else{
			System.out.println("Tartaruga nao come "+alimento+"!!!");
			return false;
		}
	}

	@Override
	public void locomover() {
		Aquatico.nadar();
		Terrestre.andar();
	}

	@Override
	public Sexo getSexo() {
		return this.sexo;
	}

	@Override
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public Porte getPorte() {
		return this.porte;
	}

	@Override
	public void setPorte(Porte porte) {
		this.porte = porte;
	}

	@Override
	public String toString() {
		return "Tartaruga [sexo=" + sexo + ", porte=" + porte + "]";
	}

	
}
