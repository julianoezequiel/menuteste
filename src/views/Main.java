package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.FuncionarioController;
import models.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int op;
		
		do{	
			Menu.renderizar();
			
			op = sc.nextInt();
			System.out.println();
			
			switch (op) {
			case 1:
				CadastrarFuncionario.renderizar();
				break;
				
			case 2:
				
				ListarFuncionario.renderizar();
				
				break;
				
			case 3:
				
				CadastrarMarcacoes.renderizar();
								
				break;
				
			case 4:

				ListaMarcacao.renderizar();
				
				break;
				
			case 0:
				System.out.println("Saindo...");
				break;
				
			default:
				System.out.println("Digite uma opção válida");
			}
			
			
		}while(op != 0);
		
		sc.close();

	}

}
