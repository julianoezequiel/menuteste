package views;

import java.time.LocalDate;
import java.util.Scanner;

import controllers.FuncionarioController;
import controllers.MarcacaoController;
import models.Funcionario;
import models.Horario;
import models.Marcacao;

public class CadastrarMarcacoes {

	private Scanner sc = new Scanner(System.in);
	private FuncionarioController funcionarioController;
	
	public CadastrarMarcacoes() {
		this.funcionarioController = new FuncionarioController();
	}
	
	
	public void renderizar() {

		System.out.println("\n");
		System.out.println("\n --Cadastrar Marca��es --\n");
		System.out.println("\nDigite o PIS do Funcionario");
		String pisFuncionario = sc.nextLine();
		Funcionario funcionario = this.funcionarioController.buscaPis(pisFuncionario);
		if (funcionario != null) // 123
		{
			Marcacao marcacao = new Marcacao();

			System.out.println("\n Digita a Data da marca��o : ex:01/05/2021 ");
			String nextLine = sc.nextLine();
			String[] split = nextLine.split("/");
			marcacao.setData(
					LocalDate.of(Integer.valueOf(split[2]), Integer.valueOf(split[1]), Integer.valueOf(split[0])));

			System.out.println("\n Digita a hora de entrada formato 00:00 -");
			Horario horario = new Horario();
			horario.setTipo(Horario.TIPO.ENTRADA);
			marcacao.setEntrada(sc.nextDouble());			
			marcacao.getHorarios().add(horario);			
			
			System.out.println("\n Digita a hora saida para o almo�o :");
			Horario horario2 = new Horario();
			horario.setTipo(Horario.TIPO.SAIDA);
			marcacao.setSaidaAlmoco(sc.nextDouble());			
			marcacao.getHorarios().add(horario2);
			
			System.out.println("\n Digita a hora da volta do almo�o :");
			Horario horario3 = new Horario();
			horario.setTipo(Horario.TIPO.ENTRADA);
			marcacao.setSaidaAlmoco(sc.nextDouble());			
			marcacao.getHorarios().add(horario3);
			
			System.out.println("\n Digita a hora da saida :");
			Horario horario4 = new Horario();
			horario.setTipo(Horario.TIPO.SAIDA);
			marcacao.setSaidaAlmoco(sc.nextDouble());			
			marcacao.getHorarios().add(horario2);
		
			
			funcionario.getMarcacaoss().add(marcacao);

			MarcacaoController.cadastrar(marcacao);
		} else {
			System.out.println("Funcionario n�o encontrado");
		}

	}

}
