import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import animal.Animal;
import animal.Animal.Alimento;
import animal.Animal.Sexo;
import animal.animais.Baleia;
import animal.animais.Elefante;
import animal.animais.Foca;
import animal.animais.Leao;
import animal.animais.Macaco;
import animal.animais.PeixeBoi;
import animal.animais.Pinguin;
import animal.animais.Tartaruga;
import animal.animais.Tubarao;
import animal.animais.Zebra;
import instalacao.FabricaInstalacao;
import instalacao.Instalacao;
import instalacao.Instalacao.Localizacao;
import zoologico.Zoologico;

public class Main {
	public static void main(String args[]){
	//	testeDeAnimais();
	//	testeInstalacao();
	//	testeInserirAnimais();		
		testaZoologico();
	}
	
	public static void testeDeAnimais(){
		
		List<Animal> listaDeAnimais = criaAnimais();
		
		System.out.println("##### TESTANDO OS ANIMAIS #####\n");

		for(Animal animal: listaDeAnimais){
			System.out.println(animal.toString());
			animal.locomover();
			animal.alimentar(Alimento.CARNES);
			animal.alimentar(Alimento.FRUTAS);
			animal.alimentar(Alimento.PEIXES);
			animal.alimentar(Alimento.VERDURAS);
			System.out.println("-----------------------------------");
		}
	}
	
	public static void testeInstalacao(){

		List<Instalacao> listaDeInstalacoes = criaInstalacoes();
		
		
		System.out.println("##### TESTANDO AS INSTALACOES #####\n");
		
		for(Instalacao instalacao: listaDeInstalacoes){
			System.out.println(instalacao.toString());
			System.out.println("--------------------------------------------------------");
		}
	}

	public static void testeInserirAnimais(){
		FabricaInstalacao fabricaDeInstalacao = new FabricaInstalacao();

		Instalacao instalacaoBaleia = fabricaDeInstalacao.criaInstalacaoBaleia(Localizacao.CENTROESTE);
		Instalacao instalacaoLeao = fabricaDeInstalacao.criaInstalacaoLeao(Localizacao.NOROESTE);
		
		Animal baleia = new Baleia(Sexo.FEMININO);
		Animal foca = new Foca(Sexo.FEMININO);
		Animal leao = new Leao(Sexo.MASCULINO);
		
		System.out.println("##### TESTANDO INSERSAO DE ANIMAIS #####\n");		
		
		instalacaoBaleia.instalaAnimal(baleia, 0);
		instalacaoBaleia.instalaAnimal(baleia, 1);
		instalacaoBaleia.instalaAnimal(baleia, 1);
		instalacaoBaleia.instalaAnimal(foca, 1);
		
		System.out.println("-------------------------------------------------------------------------");
		instalacaoLeao.instalaAnimal(leao, 0);
		instalacaoLeao.instalaAnimal(leao, 1);
		instalacaoLeao.instalaAnimal(baleia, 2);
		instalacaoLeao.instalaAnimal(leao, 3);
		
	}

	public static void testaZoologico(){

		System.out.println("##### CRIANDO ZOOLOGICO, ANIMAIS E INSTALACOES #####");	
		Zoologico zoo = new Zoologico();
		System.out.println("Zoologico criado.");
		
		List<Animal> listaDeAnimais = criaAnimais();
		System.out.println("Animais criados.");
		
		List<Instalacao> listaDeInstalacoes = criaInstalacoes();
		System.out.println("Instalacoes criadas.");
		
		System.out.println("\n##### INSERINDO ANIMAIS NAS INSTALACOES DO ZOOLOGICO #####\n");	
		listaDeInstalacoes = insereAnimaisInstalacao(listaDeInstalacoes,listaDeAnimais);
		
		System.out.println("\n##### INSERINDO INSTALACOES NO ZOOLOGICO #####\n");	
		for(Instalacao instalacao: listaDeInstalacoes){
			zoo.insereInstalacao(instalacao);
		}
		
		System.out.println("\n##### ALIMENTACAO OS ANIMAIS ZOOLOGICO #####\n");	
		alimentarAnimais(listaDeInstalacoes);
		
		System.out.println("\n##### INFORMACAO COMPLETA DO ZOOLOGICO #####\n");	
		System.out.println(zoo.toString());
	}
	
	public static List<Instalacao> criaInstalacoes(){
		FabricaInstalacao fabricaDeInstalacao = new FabricaInstalacao();
		List<Instalacao> listaDeInstalacoes = new ArrayList<Instalacao>();

		Instalacao instalacaoBaleia = fabricaDeInstalacao.criaInstalacaoBaleia(Localizacao.CENTROESTE);
		Instalacao instalacaoElefante = fabricaDeInstalacao.criaInstalacaoElefante(Localizacao.LESTE);
		Instalacao instalacaoFoca = fabricaDeInstalacao.criaInstalacaoFoca(Localizacao.NORDESTE);
		Instalacao instalacaoLeao = fabricaDeInstalacao.criaInstalacaoLeao(Localizacao.NOROESTE);
		Instalacao instalacaoMacaco = fabricaDeInstalacao.criaInstalacaoMacaco(Localizacao.NORTE);
		Instalacao instalacaoPeixeBoi = fabricaDeInstalacao.criaInstalacaoPeixeBoi(Localizacao.OESTE);
		Instalacao instalacaoPinguin = fabricaDeInstalacao.criaInstalacaoPinguin(Localizacao.SUL);
		Instalacao instalacaoTartaruga = fabricaDeInstalacao.criaInstalacaoTartaruga(Localizacao.SULDESTE);
		Instalacao instalacaoTubarao = fabricaDeInstalacao.criaInstalacaoTubarao(Localizacao.SULDOESTE);
		Instalacao instalacaoZebra = fabricaDeInstalacao.criaInstalacaoZebra(Localizacao.CENTROESTE);		
		
		listaDeInstalacoes.add(instalacaoBaleia);
		listaDeInstalacoes.add(instalacaoElefante);
		listaDeInstalacoes.add(instalacaoFoca);
		listaDeInstalacoes.add(instalacaoLeao);
		listaDeInstalacoes.add(instalacaoMacaco);
		listaDeInstalacoes.add(instalacaoPeixeBoi);
		listaDeInstalacoes.add(instalacaoPinguin);
		listaDeInstalacoes.add(instalacaoTartaruga);
		listaDeInstalacoes.add(instalacaoTubarao);
		listaDeInstalacoes.add(instalacaoZebra);
		
		return listaDeInstalacoes;
	}

	public static List<Animal> criaAnimais(){
		List<Animal> listaDeAnimais = new ArrayList<Animal>();
		
		Animal baleia = new Baleia(Sexo.FEMININO);
		Animal baleia2 = new Baleia(Sexo.MASCULINO);

		Animal elefante = new Elefante(Sexo.MASCULINO);
		Animal elefante2 = new Elefante(Sexo.FEMININO);

		Animal foca = new Foca(Sexo.FEMININO);
		Animal foca2 = new Foca(Sexo.MASCULINO);

		Animal leao = new Leao(Sexo.MASCULINO);
		Animal leao2 = new Leao(Sexo.FEMININO);

		Animal macaco = new Macaco(Sexo.MASCULINO);
		Animal macaco2 = new Macaco(Sexo.FEMININO);
		
		Animal peixeBoi = new PeixeBoi(Sexo.MASCULINO);
		Animal peixeBoi2 = new PeixeBoi(Sexo.FEMININO);

		Animal pinguin = new Pinguin(Sexo.FEMININO);
		Animal pinguin2 = new Pinguin(Sexo.MASCULINO);

		Animal tartaruga = new Tartaruga(Sexo.FEMININO);
		Animal tartaruga2 = new Tartaruga(Sexo.MASCULINO);

		Animal tubarao = new Tubarao(Sexo.MASCULINO);
		Animal tubarao2 = new Tubarao(Sexo.FEMININO);

		Animal zebra = new Zebra(Sexo.FEMININO);
		Animal zebra2 = new Zebra(Sexo.MASCULINO);
		
		listaDeAnimais.add(baleia);		
		listaDeAnimais.add(elefante);		
		listaDeAnimais.add(foca);		
		listaDeAnimais.add(leao);		
		listaDeAnimais.add(macaco);		
		listaDeAnimais.add(peixeBoi);		
		listaDeAnimais.add(pinguin);		
		listaDeAnimais.add(tartaruga);		
		listaDeAnimais.add(tubarao);	
		listaDeAnimais.add(zebra);

		listaDeAnimais.add(baleia2);		
		listaDeAnimais.add(elefante2);		
		listaDeAnimais.add(foca2);		
		listaDeAnimais.add(leao2);		
		listaDeAnimais.add(macaco2);		
		listaDeAnimais.add(peixeBoi2);		
		listaDeAnimais.add(pinguin2);		
		listaDeAnimais.add(tartaruga2);		
		listaDeAnimais.add(tubarao2);	
		listaDeAnimais.add(zebra2);
		
		return listaDeAnimais;
	}
	
	public static List<Instalacao> insereAnimaisInstalacao(List<Instalacao> listaDeInstalacoes, List<Animal> listaDeAnimais){
		Random random = new Random();
		
		for(Instalacao instalacao: listaDeInstalacoes){
			for(Animal animal: listaDeAnimais){
				if(instalacao.getClass().getSimpleName().contains(animal.getClass().getSimpleName())){
					instalacao.instalaAnimal(animal, random.nextInt(instalacao.getCapacidadeMaxima()));
				}
			}
		}
		
		return listaDeInstalacoes;
	}
	
	public static void alimentarAnimais(List<Instalacao> listaDeInstalacoes){
		
		for(Instalacao instalacao: listaDeInstalacoes){
			for(Animal animal: instalacao.getAnimaisInstalados()){
				if(animal!= null){
					if(animal.getClass().getSimpleName().equals("Elefante")){
						animal.alimentar(Alimento.VERDURAS);
					}
					if(animal.getClass().getSimpleName().equals("Macaco")){
						animal.alimentar(Alimento.FRUTAS);
					}
					if(animal.getClass().getSimpleName().equals("Zebra")){
						animal.alimentar(Alimento.FRUTAS);
					}
					if(animal.getClass().getSimpleName().equals("Leao")){
						animal.alimentar(Alimento.CARNES);
					}
					if(animal.getClass().getSimpleName().equals("Tartaruga")){
						animal.alimentar(Alimento.VERDURAS);
					}
					if(animal.getClass().getSimpleName().equals("Pinguin")){
						animal.alimentar(Alimento.PEIXES);
					}
					if(animal.getClass().getSimpleName().equals("Foca")){
						animal.alimentar(Alimento.PEIXES);
					}
					if(animal.getClass().getSimpleName().equals("PeixeBoi")){
						animal.alimentar(Alimento.PEIXES);
					}
					if(animal.getClass().getSimpleName().equals("Baleia")){
						animal.alimentar(Alimento.PEIXES);
					}
					if(animal.getClass().getSimpleName().equals("Tubarao")){
						animal.alimentar(Alimento.PEIXES);
					}
				}
			}
		}
		
	}
}
