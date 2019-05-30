package animal.animais;

import animal.Terrestre;

public class Macaco implements Terrestre{
	private Sexo sexo;
	private Porte porte;
	
	
	public Macaco(Sexo sexo) {
		this.sexo = sexo;
		this.porte = Porte.PEQUENO;
	}

	@Override
	public boolean alimentar(Alimento alimento) {
		if(alimento.equals(Alimento.FRUTAS)){
			System.out.println("Macaco alimentado com "+alimento+"!");
			return true;
		}else{
			System.out.println("Macaco nao come "+alimento+"!!!");
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
		return "Macaco [sexo=" + sexo + ", porte=" + porte + "]";
	}

	
}
