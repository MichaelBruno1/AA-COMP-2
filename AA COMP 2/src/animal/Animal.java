package animal;

public interface Animal {
	
	public enum Alimento{
		FRUTAS, VERDURAS, CARNES, PEIXES;
	}
	
	public enum Porte{
		PEQUENO, MEDIO, GRANDE;
	}
	
	public enum Sexo{
		MASCULINO, FEMININO;
	}
	
	boolean alimentar (Alimento alimento);
	
	void locomover();
	
	Sexo getSexo();
	
	void setSexo(Sexo sexo);
	
	Porte getPorte();
	
	void setPorte(Porte porte);
}
