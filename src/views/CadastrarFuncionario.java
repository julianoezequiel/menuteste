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
		System.out.println("\n-- CADASTRAR FUNCION�RIO --\n");
		System.out.println("\nEntre com o nome do funcion�rio");
		funcionario.setNome(sc.next());
		System.out.println("\nDigite o PIS do funcion�rio");
		funcionario.setPis(sc.nextInt());
		System.out.println("\nDigite a data de admiss�o do funcion�rio");
		
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
			System.out.println("Funcion�rio cadastrado com sucesso");
		}else {
			System.out.println("Funcion�rio j� existe");
		}
		System.out.println("--------------------------------------------------------------------");
	}
	
}
