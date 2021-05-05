package views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import controllers.FuncionarioController;
import models.Funcionario;

public class CadastrarFuncionario {
	
	private static Scanner sc = new Scanner(System.in);
	private static Funcionario funcionario;
	
	public static void renderizar(){
		System.out.println("\n".repeat(20));
		funcionario = new Funcionario();
		System.out.println("\n-- CADASTRAR FUNCIONÁRIO --\n");
		System.out.println("\nEntre com o nome do funcionário");
		funcionario.setNome(sc.next());
		System.out.println("\nDigite o PIS do funcionário");
		funcionario.setPis(sc.nextInt());
		System.out.println("\nDigite a data de admissão do funcionário");
		
		String dataAdm = sc.next(); 
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = formatter.parse(dataAdm);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		funcionario.setDataAdm(date);
		
		if(FuncionarioController.cadastrar(funcionario.getPis(), funcionario)) {
			System.out.println("Funcionário cadastrado com sucesso");
		}else {
			System.out.println("Funcionário já existe");
		}
		System.out.println("--------------------------------------------------------------------");
	}
	
}
