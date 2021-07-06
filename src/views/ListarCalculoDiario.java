package views;

import controllers.CalculoDiarioController;
import models.CalculoDiario;

public class ListarCalculoDiario {

	public static void renderizar() {
		double soma = 0;
		System.out.println("\n".repeat(8));
		System.out.println("#### LISTA DE PAGAMENTOS DIÁRIOS ####\n\n\n");
		System.out.println("--------------------------------------------------------\n");
		for(CalculoDiario calculoEncontrado : CalculoDiarioController.listar()) {
			System.out.println(calculoEncontrado);
			soma = soma + calculoEncontrado.getPagamento();
		}
		System.out.println("Soma dos pagamentos até o momento: " + soma);
	}
}
