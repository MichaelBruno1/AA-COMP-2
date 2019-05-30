package zoologico;

import instalacao.Instalacao;
import instalacao.Instalacao.Localizacao;

public class Zoologico {

	private Instalacao instalacaoNorte;
	private Instalacao instalacaoSul;
	private Instalacao instalacaoLeste;
	private Instalacao instalacaoOeste;
	private Instalacao instalacaoNordeste;
	private Instalacao instalacaoNoroeste;
	private Instalacao instalacaoSuldeste;
	private Instalacao instalacaoSuldoeste;
	private Instalacao instalacaoCentroeste;
	
	public Zoologico(){}
	
	public Zoologico(Instalacao instalacaoNorte, Instalacao instalacaoSul, Instalacao instalacaoLeste,
			Instalacao instalacaoOeste, Instalacao instalacaoNordeste, Instalacao instalacaoNoroeste,
			Instalacao instalacaoSuldeste, Instalacao instalacaoSuldoeste, Instalacao instalacaoCentroeste) {
		
		this.instalacaoNorte = instalacaoNorte;
		this.instalacaoSul = instalacaoSul;
		this.instalacaoLeste = instalacaoLeste;
		this.instalacaoOeste = instalacaoOeste;
		this.instalacaoNordeste = instalacaoNordeste;
		this.instalacaoNoroeste = instalacaoNoroeste;
		this.instalacaoSuldeste = instalacaoSuldeste;
		this.instalacaoSuldoeste = instalacaoSuldoeste;
		this.instalacaoCentroeste = instalacaoCentroeste;
	}
	
	public void insereInstalacao(Instalacao instalacao){
		Localizacao localizacao = instalacao.getLocalizacao();
		
		switch (localizacao) {
		case NORTE:
			if(this.instalacaoNorte == null){
				this.instalacaoNorte = instalacao;
				System.out.println(instalacao.getClass().getSimpleName()+" inserida com sucesso na localizacao " +localizacao+ "!");
			}else{
				System.out.println("Ja possui uma instalacao nesse no local " +localizacao+ "!!!");
			}
			break;
		case SUL:
			if(this.instalacaoSul == null){
				this.instalacaoSul = instalacao;
				System.out.println(instalacao.getClass().getSimpleName()+" inserida com sucesso na localizacao " +localizacao+ "!");
			}else{
				System.out.println("Ja possui uma instalacao nesse no local " +localizacao+ "!!!");
			}
			break;
		case LESTE:
			if(this.instalacaoLeste == null){
				this.instalacaoLeste = instalacao;
				System.out.println(instalacao.getClass().getSimpleName()+" inserida com sucesso na localizacao " +localizacao+ "!");
			}else{
				System.out.println("Ja possui uma instalacao nesse no local " +localizacao+ "!!!");
			}
			break;
		case OESTE:
			if(this.instalacaoOeste == null){
				this.instalacaoOeste = instalacao;
				System.out.println(instalacao.getClass().getSimpleName()+" inserida com sucesso na localizacao " +localizacao+ "!");
			}else{
				System.out.println("Ja possui uma instalacao nesse no local " +localizacao+ "!!!");
			}
			break;
		case NORDESTE:
			if(this.instalacaoNordeste == null){
				this.instalacaoNordeste = instalacao;
				System.out.println(instalacao.getClass().getSimpleName()+" inserida com sucesso na localizacao " +localizacao+ "!");
			}else{
				System.out.println("Ja possui uma instalacao nesse no local " +localizacao+ "!!!");
			}
			break;
		case NOROESTE:
			if(this.instalacaoNoroeste == null){
				this.instalacaoNoroeste = instalacao;
				System.out.println(instalacao.getClass().getSimpleName()+" inserida com sucesso na localizacao " +localizacao+ "!");
			}else{
				System.out.println("Ja possui uma instalacao nesse no local " +localizacao+ "!!!");
			}
			break;
		case SULDESTE:
			if(this.instalacaoSuldeste == null){
				this.instalacaoSuldeste = instalacao;
				System.out.println(instalacao.getClass().getSimpleName()+" inserida com sucesso na localizacao " +localizacao+ "!");
			}else{
				System.out.println("Ja possui uma instalacao nesse no local " +localizacao+ "!!!");
			}
			break;
		case SULDOESTE:
			if(this.instalacaoSuldoeste == null){
				this.instalacaoSuldoeste = instalacao;
				System.out.println(instalacao.getClass().getSimpleName()+" inserida com sucesso na localizacao " +localizacao+ "!");
			}else{
				System.out.println("Ja possui uma instalacao nesse no local " +localizacao+ "!!!");
			}
			break;
		case CENTROESTE:
			if(this.instalacaoCentroeste == null){
				this.instalacaoCentroeste = instalacao;
				System.out.println(instalacao.getClass().getSimpleName()+" inserida com sucesso na localizacao " +localizacao+ "!");
			}else{
				System.out.println("Ja possui uma instalacao no local " +localizacao+ "!!!");
			}
			break;
		}
	}

	public Instalacao getIntalacaoNorte() {
		return instalacaoNorte;
	}

	public Instalacao getIntalacaoSul() {
		return instalacaoSul;
	}

	public Instalacao getIntalacaoLeste() {
		return instalacaoLeste;
	}

	public Instalacao getIntalacaoOeste() {
		return instalacaoOeste;
	}

	public Instalacao getIntalacaoNordeste() {
		return instalacaoNordeste;
	}

	public Instalacao getIntalacaoNoroeste() {
		return instalacaoNoroeste;
	}

	public Instalacao getIntalacaoSuldeste() {
		return instalacaoSuldeste;
	}

	public Instalacao getIntalacaoSuldoeste() {
		return instalacaoSuldoeste;
	}

	public Instalacao getIntalacaoCentroeste() {
		return instalacaoCentroeste;
	}

	@Override
	public String toString() {
		return "Zoologico [\n instalacaoNorte = " + instalacaoNorte + ",\n instalacaoSul = " + instalacaoSul
				+ ",\n instalacaoLeste = " + instalacaoLeste + ",\n instalacaoOeste = " + instalacaoOeste
				+ ",\n instalacaoNordeste = " + instalacaoNordeste + ",\n instalacaoNoroeste = " + instalacaoNoroeste
				+ ",\n instalacaoSuldeste = " + instalacaoSuldeste + ",\n instalacaoSuldoeste = " + instalacaoSuldoeste
				+ ",\n instalacaoCentroeste = " + instalacaoCentroeste + "\n]";
	}

	
	
}
