package views;

import java.util.Scanner;

import controllers.EnderecoController;
import models.Endereco;
import utils.Console;

public class CadastrarEndereco {
	public static Scanner sc = new Scanner(System.in);

	public static void renderizar() {
		Endereco endereco = new Endereco();
		System.out.println("\n".repeat(8));
		System.out.println("#### CADASTRAR ENDERECO ####");
		System.out.println("Digite o estado do endereço: ");
		endereco.setEstado(sc.next());
		System.out.println("Digite a cidade do endereço: ");
		endereco.setCidade(sc.next());
		System.out.println("Digite a rua do endereço: ");
		endereco.setRua(sc.next());
		endereco.setNumero(Console.leInt("Digite o numero de endereço: "));
		System.out.println("Digite o complemento do endereço: ");
		endereco.setComplemento(sc.next());
		System.out.println("Digite o apelido do endereco: ");
		endereco.setApelidoEndereco(sc.next());
		if (EnderecoController.cadastrar(endereco)) {
			System.out.println("Endereço cadastrado com sucesso!!!\n");
		} else {
			System.out.println("Endereço ja existe!!!\n");
		}
	}
}
