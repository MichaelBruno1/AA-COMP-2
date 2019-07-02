package animal.animais;

import animal.Terrestre;

public class Elefante implements Terrestre{
	
	private Sexo sexo;
	private Porte porte;
	
	
	public Elefante(Sexo sexo) {
		this.sexo = sexo;
		this.porte = Porte.GRANDE;
	}

	@Override
	public boolean alimentar(Alimento alimento) {
		if(alimento.equals(Alimento.FRUTAS) || alimento.equals(Alimento.VERDURAS)){
			System.out.println("Elefante alimentado com "+alimento+"!");
			return true;
		}else{
			System.out.println("Elefante nao come "+alimento+"!!!");
			return false;
		}
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
		return "Elefante [sexo=" + sexo + ", porte=" + porte + "]";
	}
	
	
}
