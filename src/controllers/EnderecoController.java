package controllers;

import java.util.ArrayList;

import models.Endereco;

public class EnderecoController {
	private static ArrayList<Endereco> enderecos = new ArrayList<Endereco>();

	public static ArrayList<Endereco> listar() {
		return enderecos;
	}

	public static boolean cadastrar(Endereco endereco) {
		if (buscarPorApelido(endereco.getApelidoEndereco()) == null) {
			enderecos.add(endereco);
			return true;
		}
		return false;
	}

	public static Endereco buscarPorApelido(String apelido) {
		for (Endereco enderecoCadastrado : enderecos) {
			if (enderecoCadastrado.getApelidoEndereco().equals(apelido)) {
				return enderecoCadastrado;
			}
		}
		return null;

	}

}