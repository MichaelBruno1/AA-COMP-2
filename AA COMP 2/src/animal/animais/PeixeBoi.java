package animal.animais;

import animal.Aquatico;

public class PeixeBoi implements Aquatico{
	private Sexo sexo;
	private Porte porte;
	
	
	public PeixeBoi(Sexo sexo) {
		this.sexo = sexo;
		this.porte = Porte.PEQUENO;
	}

	@Override
	public boolean alimentar(Alimento alimento) {
		if(alimento.equals(Alimento.PEIXES)){
			System.out.println("Peixe-boi alimentada com "+alimento+"!");
			return true;
		}else{
			System.out.println("Peixe-boi nao come "+alimento+"!!!");
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
		return "PeixeBoi [sexo=" + sexo + ", porte=" + porte + "]";
	}

	
}
