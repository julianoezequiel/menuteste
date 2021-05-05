package controllers;

import java.util.ArrayList;
import java.util.Scanner;

import models.Funcionario;

public class FuncionarioController {

	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	static Scanner sc = new Scanner(System.in);
	
	public static ArrayList<Funcionario> listar() {
		return funcionarios;
	}
	
	public static boolean cadastrar(int pis, Funcionario funcionario) {

		if (buscaPis(pis) == null) {
			funcionarios.add(funcionario);
			return true;
		} else {
			return false;
		}

	}
	
	public static Funcionario buscaPis(int pis) {

		for (Funcionario funcionarioCadastrado : funcionarios) {
			if (funcionarioCadastrado.getPis() == pis) {
				return funcionarioCadastrado;
			}
		}

		return null;

	}

}
