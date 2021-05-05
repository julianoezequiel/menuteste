package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Funcionario;

public class FuncionarioController {

	private List<Funcionario> funcionarios;
	private Scanner sc;

	public FuncionarioController() {
		this.funcionarios = new ArrayList<>();
		this.sc = new Scanner(System.in);
	}

	public List<Funcionario> listar() {
		return funcionarios;
	}

	public boolean cadastrar(String pis, Funcionario funcionario) {

		if (buscaPis(pis) == null) {
			funcionarios.add(funcionario);
			return true;
		} else {
			return false;
		}

	}

	public Funcionario buscaPis(String pis) {

		for (Funcionario funcionarioCadastrado : funcionarios) {
			if (funcionarioCadastrado.getPis() == pis) {
				return funcionarioCadastrado;
			}
		}

		return null;

	}

}
