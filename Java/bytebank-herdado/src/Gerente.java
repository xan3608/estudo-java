
public class Gerente extends FuncionarioAutenticavel {

	@Override
	public double getBonificacao() {
		System.out.println("Chamando bonifica��o de Gerente");
		return super.salario;
	}
}
