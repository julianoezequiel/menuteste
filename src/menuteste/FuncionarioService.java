package menuteste;

public class FuncionarioService {

	public Funcionario adicionar() {
		System.out.println("adicionar");
		return new Funcionario();
	}

	public Funcionario editar() {
		System.out.println("editar");
		return new Funcionario();
	}

	public void remover() {
		System.out.println("remover");
	}
}
