package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.EnderecoController;
import controllers.FuncionarioController;
import models.Endereco;
import models.Funcionario;
import models.ListaEndereco;
import utils.Console;

public class CadastrarFuncionario 
{
	private static Scanner sc = new Scanner(System.in);
	private static Funcionario funcionario;
	private static Endereco endereco;
	private static ListaEndereco lista;
	private static ArrayList<ListaEndereco> listas;
	private static String opcao, apelido;
	public static void renderizar() 
	{
		{
		funcionario = new Funcionario();
		listas = new ArrayList<ListaEndereco>();
		System.out.println("\n".repeat(8));
		System.out.println("#### CADASTRAR FUNCIONARIO ####");
		funcionario.setNome(Console.primMaius("Digite o nome do funcionario:"));
		funcionario.setPis(Console.primMaius("Digite o PIS do funcionario:"));
		funcionario.setCargo(Console.primMaius("Digite o cargo do funcionario:"));
		funcionario.setDataAdm(Console.transData("Digite a data de admição do funcionario:"));
		funcionario.setValorHora(Console.leDouble("Digite o valor da hora do funcionario:"));
		do
		{
			endereco = new Endereco();
			lista = new ListaEndereco();
			System.out.println("Informe o apelido do endereço:");
			apelido = sc.next();	
			endereco = EnderecoController.buscarPorApelido(apelido);
			if(endereco != null)
			{
				lista.setEnderecos(endereco);
				lista.setApelidoEndereco(endereco.getApelidoEndereco());
				
				listas.add(lista);
				
			}else 
			{
				System.out.println("Este endereco nao existe");
			}
			System.out.println("\n Deseja adicionar mais endereços?");
			opcao = sc.next();
		}while(opcao.equals("S"));
		funcionario.setEndereco(listas);
		if(FuncionarioController.cadastrar(funcionario)) {
			System.out.println("\n Funcionario Cadastado com sucesso!");
		}else {
			System.out.println("Não foi possível cadastrar o funcionário");
		}
		
		
	}
	}

}
