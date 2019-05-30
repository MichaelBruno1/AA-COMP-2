package animal.animais;

import animal.Aquatico;

public class Tubarao implements Aquatico{

	private Sexo sexo;
	private Porte porte;
	
	
	public Tubarao(Sexo sexo) {
		this.sexo = sexo;
		this.porte = Porte.GRANDE;
	}

	@Override
	public boolean alimentar(Alimento alimento) {
		if(alimento.equals(Alimento.CARNES) || alimento.equals(Alimento.PEIXES)){
			System.out.println("Tubarao alimentado com "+alimento+"!");
			return true;
		}else{
			System.out.println("Tubarao nao come "+alimento+"!!!");
			return false;
		}
	}

	@Override
	public void locomover() {
		Aquatico.nadar();
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
		return "Tubarao [sexo=" + sexo + ", porte=" + porte + "]";
	}

	
}
