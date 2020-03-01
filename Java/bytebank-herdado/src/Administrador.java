
public class Administrador extends FuncionarioAutenticavel {

	@Override
	public double getBonificacao() {
		System.out.println("Chamando bonificação do Administrador");
		return 50;
	}

}
