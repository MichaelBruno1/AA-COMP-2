package animal;

public interface Anfibio extends Terrestre, Aquatico{
	@Override
	default void locomover () {
		nadar();
		andar();
	}
}
