package views;

import controllers.FuncionarioController;
import models.Funcionario;

public class ListarFuncionario {
	public static void renderizar()
	{
		System.out.println("\n".repeat(8));
		System.out.println("#### LISTAR FUNCIONARIO ####");
		for(Funcionario funcionarioCadastrado : FuncionarioController.listar()) 
		{
			System.out.println(funcionarioCadastrado);
			System.out.println("--------------------------------------------------------------------");
		}
	}

}
