package animal.animais;

import animal.Terrestre;

public class Zebra implements Terrestre{

	private Sexo sexo;
	private Porte porte;
	
	
	public Zebra(Sexo sexo) {
		this.sexo = sexo;
		this.porte = Porte.MEDIO;
	}

	@Override
	public boolean alimentar(Alimento alimento) {
		if(alimento.equals(Alimento.VERDURAS) || alimento.equals(Alimento.FRUTAS)){
			System.out.println("Zebra alimentada com "+alimento+"!");
			return true;
		}else{
			System.out.println("Zebra nao come "+alimento+"!!!");
			return false;
		}
	}

	@Override
	public void locomover() {
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
		return "Zebra [sexo=" + sexo + ", porte=" + porte + "]";
	}

	
}
