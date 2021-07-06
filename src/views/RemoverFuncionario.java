package views;

import controllers.FuncionarioController;
import models.Funcionario;
import utils.Console;

public class RemoverFuncionario {

	private static Funcionario funcionario;
	
	public static void renderizar() {
		funcionario = new Funcionario();
		String pis = Console.primMaius("Digite o n�mero do pis do funcion�rio: ");
		funcionario = FuncionarioController.buscarPorPis(pis);
		if(funcionario != null) {
			FuncionarioController.remover(funcionario);
			System.out.println("Funcion�rio removido com sucesso");
		}else {
			System.out.println("N�o foi poss�vel achar o funcion�rio");
		}
	}
}
