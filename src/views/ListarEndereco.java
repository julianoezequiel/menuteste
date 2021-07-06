package views;

import controllers.EnderecoController;
import models.Endereco;

public class ListarEndereco 
{
	public static void renderizar()
	{
		System.out.println("\n".repeat(8));
		System.out.println("#### LISTAR ENDEREÇOS ####\n\n\n");
		System.out.println("--------------------------------------------------------\n");
		for (Endereco enderecoCadastrado : EnderecoController.listar()) {
			System.out.println(enderecoCadastrado);
		}
		System.out.println("--------------------------------------------------------\n");
	}

}
