package controllers;

import java.util.ArrayList;

import models.Funcionario;

public class FuncionarioController 
{
	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public static ArrayList<Funcionario> listar()
	{
		return funcionarios;
	}
	
	public static Funcionario buscarPorPis(String pis)
	{
		for(Funcionario funcionarioCadastrado : funcionarios) {
			if(funcionarioCadastrado.getPis().equals(pis)) 
			{
				return funcionarioCadastrado;
			}
		}
		return null;
	}
	
	public static boolean cadastrar(Funcionario funcionario) 
	{
		for(Funcionario funcionarioCadastrado : funcionarios) 
		{
			if(funcionarioCadastrado.getPis().equals(funcionario.getPis())) 
			{
				return false;
			}
		}
		funcionarios.add(funcionario);
		return true;
	}
	
	public static void editar(Funcionario funcionario, Funcionario novoFuncionario) 
	{
		for(int i = 0; i < funcionarios.size(); i++) {
			if(funcionarios.get(i).getPis().equals(funcionario.getPis())) {
				funcionarios.get(i).setNome(novoFuncionario.getNome());
				funcionarios.get(i).setCargo(novoFuncionario.getCargo());
				funcionarios.get(i).setDataAdm(novoFuncionario.getDataAdm());
				funcionarios.get(i).setValorHora(novoFuncionario.getValorHora());
				funcionarios.get(i).setEndereco(novoFuncionario.getEndereco());
			}
		}
	}
	
	public static void remover(Funcionario funcionario)
	{
		for(int i = 0; i < funcionarios.size(); i++) {
			if(funcionarios.get(i).getPis().equals(funcionario.getPis())) {
				funcionarios.remove(i);
			}
		}
	}
	
	
}
