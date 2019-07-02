package animal.animais;

import animal.Aquatico;

public class Foca implements Aquatico{


	private Sexo sexo;
	private Porte porte;
	
	
	public Foca(Sexo sexo) {
		this.sexo = sexo;
		this.porte = Porte.MEDIO;
	}

	@Override
	public boolean alimentar(Alimento alimento) {
		if(alimento.equals(Alimento.PEIXES)){
			System.out.println("Foca alimentada com "+alimento+"!");
			return true;
		}else{
			System.out.println("Foca nao come "+alimento+"!!!");
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
		return "Foca [sexo=" + sexo + ", porte=" + porte + "]";
	}

	
}
