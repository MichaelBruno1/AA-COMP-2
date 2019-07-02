package animal;

public interface Terrestre extends Animal{

	default void andar(){
		System.out.println("Estou andando!");
	}

	@Override
	default void locomover() {
		andar();
	}
}
