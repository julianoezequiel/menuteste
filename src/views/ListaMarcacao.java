package views;

import controllers.MarcacaoController;
import models.Marcacao;

public class ListaMarcacao {
	
	public static void renderizar() {
		System.out.println("\n".repeat(15));
		System.out.println("\n-- LISTAR Marcacoes --\n");
		for(Marcacao marcacaoCadastrada : MarcacaoController.listarMarcacoes()) {
			
			System.out.println(marcacaoCadastrada);
		}	
	}  
	

}
