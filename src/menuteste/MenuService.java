package menuteste;

import java.util.Scanner;

public class MenuService {

	private FuncionarioService funcionarioService;

	public MenuService() {
		this.funcionarioService = new FuncionarioService();
	}

	public void menu() {

		System.out.println("Digite uma opção\n");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();

		switch (s) {
		case "1":
			this.funcionarioService.adicionar();
			break;
		case "2":
			this.funcionarioService.editar();
			break;

		case "3":
			this.funcionarioService.remover();
			break;
		default:
			break;
		}		
		menu();

	}

}
