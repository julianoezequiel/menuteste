package views;

import controllers.FuncionarioController;
import models.Funcionario;

public class ListarFuncionario {
	
	public static void renderizar(){
		System.out.println("\n");
		System.out.println("\n-- LISTAR FUNCIONARIOS --\n");
		
		for(Funcionario funcionarioCadastrado : FuncionarioController.listar()) {
			System.out.println(funcionarioCadastrado);
		}
	}
	
}
