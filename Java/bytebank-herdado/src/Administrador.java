
public class Administrador extends FuncionarioAutenticavel {

	@Override
	public double getBonificacao() {
		System.out.println("Chamando bonifica��o do Administrador");
		return 50;
	}

}
