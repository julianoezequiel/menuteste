package views;

import controllers.MarcacaoController;
import models.Marcacao;

public class ListaMarcacao {
	
	public static void renderizar() {
		System.out.println("\n");
		System.out.println("\n-- LISTAR Marcacoes --\n");
		for(Marcacao marcacaoCadastrada : MarcacaoController.listarMarcacoes()) {
			
			System.out.println(marcacaoCadastrada);
		}	
	}  
	

}
