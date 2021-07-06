package views;


import controllers.MarcacaoController;
import models.Marcacao;

public class ListarMarcacao 
{
	public static void renderizar()
	{
		System.out.println("\n".repeat(8));
		System.out.println("#### LISTAR FUNCIONARIO ####");
		for(Marcacao marcacaoCadastrada : MarcacaoController.listar()) 
		{
			System.out.println(marcacaoCadastrada);
			System.out.println("--------------------------------------------------------------------");
		}
	}

}
