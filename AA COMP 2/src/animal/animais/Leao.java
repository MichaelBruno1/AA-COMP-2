package animal.animais;

import animal.Terrestre;

public class Leao implements Terrestre{

	private Sexo sexo;
	private Porte porte;
	
	
	public Leao(Sexo sexo) {
		this.sexo = sexo;
		this.porte = Porte.MEDIO;
	}

	@Override
	public boolean alimentar(Alimento alimento) {
		if(alimento.equals(Alimento.CARNES)){
			System.out.println("Leao alimentado com "+alimento+"!");
			return true;
		}else{
			System.out.println("Leao nao come "+alimento+"!!!");
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
		return "Leao [sexo=" + sexo + ", porte=" + porte + "]";
	}

	
}
