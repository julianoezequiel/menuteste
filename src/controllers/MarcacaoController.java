package controllers;

import java.util.ArrayList;

import models.Marcacao;

public class MarcacaoController {
	
	private static ArrayList<Marcacao> marcacoes = new ArrayList<Marcacao>();
	
	public static ArrayList<Marcacao> listarMarcacoes(){
		return marcacoes;
	}
	
	public static boolean cadastrar(Marcacao marcacao){
		
		marcacoes.add(marcacao);
		return true;
		
	}

}
