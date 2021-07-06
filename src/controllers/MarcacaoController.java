package controllers;

import java.util.ArrayList;
import java.util.Date;

import models.Marcacao;

public class MarcacaoController {
	private static ArrayList<Marcacao> marcacoes = new ArrayList<Marcacao>();

	public static ArrayList<Marcacao> listar() {
		return marcacoes;
	}

	public static boolean cadastrar(Marcacao marcacao) {
		for (Marcacao marcacaoCadastrada : marcacoes) {
			if (marcacaoCadastrada.getFuncionarios() == marcacao.getFuncionarios()
					&& marcacaoCadastrada.getDataMarcacao() == marcacao.getDataMarcacao()) {
				return false;
			}
		}
		marcacoes.add(marcacao);
		return true;
	}
	
	public static Marcacao verificar(Date data, String pisFuncionario) {
		for(Marcacao marcacaoEncontrada : listar()) {
			if(marcacaoEncontrada.getDataMarcacao().equals(data) && marcacaoEncontrada.getFuncionarios().getPis().equals(pisFuncionario)) {
				return marcacaoEncontrada;
			}
		}
		return null;
	}
	

	

}
