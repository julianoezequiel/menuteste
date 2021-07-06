package views;
import java.util.Date;
import java.util.Scanner;

import controllers.FuncionarioController;
import controllers.MarcacaoController;
import models.Funcionario;
import models.Marcacao;
import utils.Console;

public class CadastrarMarcacao 
{
	private static Scanner sc = new Scanner(System.in);
	private static Funcionario funcionario;
	public static String pisFuncionario;
	public static Date entradaED, dataMED, saidaAEM, voltaAED, saidaED;
		public static void renderizar() 
		{
			
			Marcacao marcacao = new Marcacao();
			System.out.println("\n".repeat(8));
			System.out.println("#### CADASTRAR MARCAÇÕES ####");
			System.out.println("Digite o Pis do Funcionario");
			pisFuncionario = sc.next();
			funcionario = FuncionarioController.buscarPorPis(pisFuncionario);
			if(funcionario != null)
			{
				marcacao.setFuncionarios(funcionario);
				marcacao.setDataMarcacao(Console.transData("Digite a data da marcacacao"));
				marcacao.setHoraEntrada(Console.transHora("Digite a Hora de Entrada do Funcionario:"));
				marcacao.setHoraSaidaAlmoco(Console.transHora("Digite a Hora de Saida para o Almoço do Funcionario:"));
				marcacao.setHoraVoltaAlmoco(Console.transHora("Digite a Hora de Volta Almoço do Funcionario:"));
				marcacao.setHoraSaida(Console.transHora("Digite a Hora de Saida da Empresa do Funcionario:"));	
				if(MarcacaoController.cadastrar(marcacao)) 
				{	
					System.out.println("Marcação Cadastrada com Sucesso!!!");
				}else {
					System.out.println("Essa Marcação já Existe!!!");
				}	
				
			}else
			{
				System.out.println("Este Funcionario não existe");
				
			}
			
		}

	}