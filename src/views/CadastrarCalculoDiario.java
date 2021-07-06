package views;

import java.util.Date;

import controllers.CalculoDiarioController;
import controllers.FuncionarioController;
import controllers.MarcacaoController;
import models.CalculoDiario;
import models.Funcionario;
import models.Marcacao;
import utils.Console;

public class CadastrarCalculoDiario {

	private static Funcionario funcionario;
	private static Marcacao marcacao;
	private static Date data;
	private static CalculoDiario calculo;
	
	public static void renderizar() {
		funcionario = new Funcionario();
		marcacao = new Marcacao();
		data = new Date();
		String pis = Console.primMaius("Digite o pis do funcionário: ");
		funcionario = FuncionarioController.buscarPorPis(pis);
		if(funcionario != null) {
			calculo = new CalculoDiario();
			calculo.setFuncionario(funcionario);
			data = Console.transData("Digite a data para fazer o cálculo");
			marcacao = MarcacaoController.verificar(data, funcionario.getPis());
			if(marcacao != null) {
				calculo.setData(data);
				calculo.setPagamento(CalculoDiarioController.calcular(marcacao.getMinTrab(), funcionario.getValorHora()));
				CalculoDiarioController.cadastrar(calculo);
				System.out.println("Cálculo do dia " + data + " feito com sucesso");
			}else {
				System.out.println("Não existe marcação desta data");
			}
		}else {
			System.out.println("Funcionário não encontrado");
		}
	}
}
