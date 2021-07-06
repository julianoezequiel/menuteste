package views;

import controllers.FuncionarioController;
import models.Funcionario;
import utils.Console;

public class RemoverFuncionario {

	private static Funcionario funcionario;
	
	public static void renderizar() {
		funcionario = new Funcionario();
		String pis = Console.primMaius("Digite o número do pis do funcionário: ");
		funcionario = FuncionarioController.buscarPorPis(pis);
		if(funcionario != null) {
			FuncionarioController.remover(funcionario);
			System.out.println("Funcionário removido com sucesso");
		}else {
			System.out.println("Não foi possível achar o funcionário");
		}
	}
}
