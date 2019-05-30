package instalacao;

public class Tanque extends ElementoInstalacao{
	double volumeEmLitros;

	
	public Tanque(double volumeEmLitros) {
		this.volumeEmLitros = volumeEmLitros;
	}

	public double getVolumeEmLitros() {
		return volumeEmLitros;
	}

	@Override
	public String toString() {
		return "Tanque [volumeEmLitros=" + volumeEmLitros + "]";
	}
		
}
