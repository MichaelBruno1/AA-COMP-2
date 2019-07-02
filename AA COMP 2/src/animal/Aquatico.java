package animal;

public interface Aquatico extends Animal{

	default void nadar(){
		System.out.println("Estou nadando!");
	}

	@Override
	default void locomover() {
		nadar();
	}
	
	
}
