package instalacao;

import java.util.ArrayList;
import java.util.List;

import instalacao.Instalacao.Localizacao;
import instalacao.instalacoes.InstalacaoBaleia;
import instalacao.instalacoes.InstalacaoElefante;
import instalacao.instalacoes.InstalacaoFoca;
import instalacao.instalacoes.InstalacaoLeao;
import instalacao.instalacoes.InstalacaoMacaco;
import instalacao.instalacoes.InstalacaoPeixeBoi;
import instalacao.instalacoes.InstalacaoPinguin;
import instalacao.instalacoes.InstalacaoTartaruga;
import instalacao.instalacoes.InstalacaoTubarao;
import instalacao.instalacoes.InstalacaoZebra;

public class FabricaInstalacao {

	public Instalacao criaInstalacaoBaleia(Localizacao localizacao){
		int capacidadeMaxima = 2;
		double temperatura = 19;
		
		List<ElementoInstalacao> listaElementoInstalacao = new ArrayList<ElementoInstalacao>();
		ElementoInstalacao elementoInstalacao = new Tanque(1000);
		listaElementoInstalacao.add(elementoInstalacao);
		Instalacao instalacao = new InstalacaoBaleia(capacidadeMaxima, localizacao, temperatura, listaElementoInstalacao);
		return instalacao;
	}
	
	public Instalacao criaInstalacaoElefante(Localizacao localizacao){
		int capacidadeMaxima = 2;
		double temperatura = 23;
		
		List<ElementoInstalacao> listaElementoInstalacao = new ArrayList<ElementoInstalacao>();
		ElementoInstalacao elementoInstalacao = new Jaula(20,30,25);
		listaElementoInstalacao.add(elementoInstalacao);
		
		Instalacao instalacao = new InstalacaoElefante(capacidadeMaxima, localizacao, temperatura, listaElementoInstalacao);
		return instalacao;
	}
	
	public Instalacao criaInstalacaoFoca(Localizacao localizacao){
		int capacidadeMaxima = 2;
		double temperatura = 23;
		
		List<ElementoInstalacao> listaElementoInstalacao = new ArrayList<ElementoInstalacao>();
		ElementoInstalacao elementoInstalacao = new Jaula(20,30,25);
		listaElementoInstalacao.add(elementoInstalacao);
		
		Instalacao instalacao = new InstalacaoFoca(capacidadeMaxima, localizacao, temperatura, listaElementoInstalacao);
		return instalacao;
	}
	
	public Instalacao criaInstalacaoLeao(Localizacao localizacao){
		int capacidadeMaxima = 3;
		double temperatura = 21.5;
		
		List<ElementoInstalacao> listaElementoInstalacao = new ArrayList<ElementoInstalacao>();
		ElementoInstalacao elementoInstalacao = new Jaula(20, 30, 25);
		listaElementoInstalacao.add(elementoInstalacao);
		
		Instalacao instalacao = new InstalacaoLeao(capacidadeMaxima, localizacao, temperatura, listaElementoInstalacao);
		return instalacao;
	}
	
	public Instalacao criaInstalacaoMacaco(Localizacao localizacao){
		int capacidadeMaxima = 10;
		double temperatura = 25;
		
		List<ElementoInstalacao> listaElementoInstalacao = new ArrayList<ElementoInstalacao>();
		ElementoInstalacao elementoInstalacao = new Jaula(40, 37.5, 90);
		listaElementoInstalacao.add(elementoInstalacao);
		
		Instalacao instalacao = new InstalacaoMacaco(capacidadeMaxima, localizacao, temperatura, listaElementoInstalacao);
		return instalacao;
	}	
	
	public Instalacao criaInstalacaoPeixeBoi(Localizacao localizacao){
		int capacidadeMaxima = 7;
		double temperatura = 18;
		
		List<ElementoInstalacao> listaElementoInstalacao = new ArrayList<ElementoInstalacao>();
		ElementoInstalacao elementoInstalacao = new Tanque(750);
		listaElementoInstalacao.add(elementoInstalacao);
		
		Instalacao instalacao = new InstalacaoPeixeBoi(capacidadeMaxima, localizacao, temperatura, listaElementoInstalacao);
		return instalacao;
	}
	
	public Instalacao criaInstalacaoPinguin(Localizacao localizacao){
		int capacidadeMaxima = 25;
		double temperatura = 15;
		
		List<ElementoInstalacao> listaElementoInstalacao = new ArrayList<ElementoInstalacao>();
		ElementoInstalacao elementoInstalacao = new Tanque(100);
		listaElementoInstalacao.add(elementoInstalacao);
		
		Instalacao instalacao = new InstalacaoPinguin(capacidadeMaxima, localizacao, temperatura, listaElementoInstalacao);
		return instalacao;
	}
	
	public Instalacao criaInstalacaoTartaruga(Localizacao localizacao){
		int capacidadeMaxima = 17;
		double temperatura = 20;
		
		List<ElementoInstalacao> listaElementoInstalacao = new ArrayList<ElementoInstalacao>();
		ElementoInstalacao elementoInstalacao = new Tanque(200);
		listaElementoInstalacao.add(elementoInstalacao);
		
		Instalacao instalacao = new InstalacaoTartaruga(capacidadeMaxima, localizacao, temperatura, listaElementoInstalacao);
		return instalacao;
	}
	
	public Instalacao criaInstalacaoTubarao(Localizacao localizacao){
		int capacidadeMaxima = 2;
		double temperatura = 22;
		
		List<ElementoInstalacao> listaElementoInstalacao = new ArrayList<ElementoInstalacao>();
		ElementoInstalacao elementoInstalacao = new Tanque(500);
		listaElementoInstalacao.add(elementoInstalacao);
		
		Instalacao instalacao = new InstalacaoTubarao(capacidadeMaxima, localizacao, temperatura, listaElementoInstalacao);
		return instalacao;
	}
	
	public Instalacao criaInstalacaoZebra(Localizacao localizacao){
		int capacidadeMaxima = 2;
		double temperatura = 24;
		
		List<ElementoInstalacao> listaElementoInstalacao = new ArrayList<ElementoInstalacao>();
		ElementoInstalacao elementoInstalacao = new Jaula(20, 30, 25);
		listaElementoInstalacao.add(elementoInstalacao);
		
		Instalacao instalacao = new InstalacaoZebra(capacidadeMaxima, localizacao, temperatura, listaElementoInstalacao);
		return instalacao;
	}
}
