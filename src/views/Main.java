package views;

import utils.Console;

public class Main {

	public static void main(String[] args) {

		int op;
		System.out.println("#### BEM VINDO AO TYPEPONTO ####");
		do {
			System.out.println("1 - Cadastrar Endereço ");
			System.out.println("2 - Listar Endereço");
			System.out.println("3 - Cadastrar Funcionario");
			System.out.println("4 - Listar Funcionario");
			System.out.println("5 - Cadastrar Marcação");
			System.out.println("6 - Listar Marcação");
			System.out.println("7 - Editar Funcionário");
			System.out.println("8 - Remover Funcionário");
			System.out.println("9 - Cadastrar Cálculo Diário");
			System.out.println("10 - Listar Cálculos Totais");
			System.out.println("11 - Listar Cálculos Por Dia");
			System.out.println("0 - Sair");

			op = Console.leInt("Digite a opção desejada");

			switch (op) {
			case 1:
				CadastrarEndereco.renderizar();
				break;
				
			case 2:
				ListarEndereco.renderizar();
				break;

			case 3:
				CadastrarFuncionario.renderizar();
				break;

			case 4:
				ListarFuncionario.renderizar();
				break;

			case 5:
				CadastrarMarcacao.renderizar();
				break;

			case 6:
				ListarMarcacao.renderizar();
				break;

			case 7:
				EditarFuncionario.renderizar();
				break;
				
			case 8:
				RemoverFuncionario.renderizar();
				break;

			case 9:
				CadastrarCalculoDiario.renderizar();
				break;
				
			case 10:
				ListarCalculoDiario.renderizar();
				break;
				
			case 11:
				ListarCalculoPorDia.renderizar();
				break;
				
			case 0:
				System.out.println("\n".repeat(8));
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("\n".repeat(8));
				System.out.println("Digite uma opção válida");

			}
		} while (op != 0);

	}

}
