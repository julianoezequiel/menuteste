package views;

import java.util.ArrayList;

import controllers.EnderecoController;
import controllers.FuncionarioController;
import models.Endereco;
import models.Funcionario;
import models.ListaEndereco;
import utils.Console;

public class EditarFuncionario {
	
	private static Funcionario funcionario, funcionarioEditado;
	private static Endereco endereco;
	private static ListaEndereco lista;
	private static ArrayList<ListaEndereco> listas;
	
	
	public static void renderizar() {
		funcionario = new Funcionario();
		funcionarioEditado = new Funcionario();
		listas = new ArrayList<ListaEndereco>();
		String pis = Console.primMaius("Digite o pis do funcion�rio a ser editado: ");
		funcionario = FuncionarioController.buscarPorPis(pis);
		if(funcionario != null) {
			funcionarioEditado.setNome(Console.primMaius("Digite o novo nome do funcion�rio: "));
			funcionarioEditado.setCargo(Console.primMaius("Digite o novo cargo do funcionario: "));
			funcionarioEditado.setDataAdm(Console.transData("Digite a nova data de admiss�o do funcionario: "));
			funcionarioEditado.setValorHora(Console.leDouble("Digite o novo valor da hora do funcion�rio: "));
			String opcao = "N";
			String apelido = new String();
			do
			{
				endereco = new Endereco();
				lista = new ListaEndereco();
				apelido = Console.primMaius("Informe o apelido do endere�o:");
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
				opcao = Console.primMaius("Deseja adicionar mais endere�os?");
			}while(opcao.equals("S"));
			funcionarioEditado.setEndereco(listas);
			FuncionarioController.editar(funcionario, funcionarioEditado);
			System.out.println("Funcion�rio editado com sucesso");
		}else {
			System.out.println("Funcion�rio n�o encontrado");
		}
	}

}
