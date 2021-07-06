package views;

import java.util.Date;

import controllers.CalculoDiarioController;
import models.CalculoDiario;
import utils.Console;

public class ListarCalculoPorDia {

	public static void renderizar() {
		double soma = 0;
		System.out.println("\n".repeat(8));
		System.out.println("#### LISTA DE PAGAMENTOS POR DIA ####\n\n\n");
		System.out.println("--------------------------------------------------------\n");
		Date dia = Console.transData("Digite a data para listar: ");
		for(CalculoDiario calculoEncontrado : CalculoDiarioController.listarPorDia(dia)) {
			System.out.println(calculoEncontrado);
			soma = soma + calculoEncontrado.getPagamento();
		}
		System.out.println("Soma dos pagamentos até o momento: " + soma);
	}
}
